package uk.ac.ncl.index;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.ncl.model.Help;
import spark.Request;
import spark.Response;
import spark.Route;
import uk.ac.ncl.DAO.DataController;
import uk.ac.ncl.model.CoreRecord;
import uk.ac.ncl.model.Property;
import uk.ac.ncl.model.StoneRecording;
import uk.ac.ncl.model.TypeMap;
import uk.ac.ncl.util.ViewUtil;

public class IndexController {
    static Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 
     */
    public static Route serveIndexPage = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, "/velocity/index.vm");

    };

    /**
     * Record stone properties as captured in the form by the user
     * 
     * @param request
     * @param response
     * @return
     */
    public static String recordstone(Request request, Response response) {
        Map<String, Object> model = new HashMap<>();
        List<Property> properties = new ArrayList<Property>();
        try {
            File file = new File("Stone_recording.csv");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            StoneRecording stoneRecording = new StoneRecording(
                    Integer.valueOf(request.queryParams("Site_No") == null ? "0" : request.queryParams("Site_No")),
                    Integer.valueOf(request.queryParams("EID") == null || request.queryParams("EID").equals("") ? "0"
                            : request.queryParams("EID")),
                    request.queryParams("Stone_Ref"), request.queryParams("Face"), request.queryParams("Course"),
                    request.queryParams("Element"), request.queryParams("Length"), request.queryParams("Height"),
                    request.queryParams("Depth"), request.queryParams("Diameter"),

                    request.queryParams("Colour"), request.queryParams("Grain_Size"),
                    request.queryParams("Grain_Shape"), request.queryParams("Grain_Roundness"),
                    request.queryParams("Grain_Sorting"), request.queryParamsValues("Grain_Types"),
                    request.queryParamsValues("Cement"), request.queryParamsValues("Veins_diagenesis"),
                    request.queryParams("Sedimentary_textures"),
                    Integer.valueOf(request.queryParams("Bedding_scale") == null
                            || request.queryParams("Bedding_scale").equals("") ? "0"
                                    : request.queryParams("Bedding_scale")),

                    request.queryParams("Fossils"), request.queryParams("Fossil_photo"),
                    request.queryParams("Broad_geology"),
                    Integer.valueOf(
                            request.queryParams("Lewis_hole") == null || request.queryParams("Lewis_hole").equals("")
                                    ? "0"
                                    : request.queryParams("Lewis_hole")),
                    Integer.valueOf(
                            request.queryParams("Reused") == null || request.queryParams("Reused").equals("") ? "0"
                                    : request.queryParams("Reused")),
                    Integer.valueOf(
                            request.queryParams("Masons_mark") == null || request.queryParams("Masons_mark").equals("")
                                    ? "0"
                                    : request.queryParams("Masons_mark")),
                    request.queryParams("Tooling"), request.queryParams("Notes_Comments"),
                    request.queryParams("Photograph_List"), request.queryParams("Drawing"),

                    request.queryParams("Recorded_by"), request.queryParams("Checked_by"),
                    request.queryParams("Date_Created"), request.queryParams("Last_Modified"),
                    Integer.valueOf(request.queryParams("Record_complete") == null
                            || request.queryParams("Record_complete").equals("") ? "0"
                                    : request.queryParams("Record_complete")),
                    request.queryParams("Face_Path"), request.queryParams("left_path"),
                    request.queryParams("right_path"), request.queryParams("reverse_path"),
                    request.queryParams("top_path"),

                    request.queryParams("base_path"), request.queryParams("site_element"));
            String[] test = request.queryParamsValues("Grain_Types");

            request.queryParams().forEach(param -> {
                if (!(param.equals("Grain_Types") || param.equals("Cement") || param.equals("Veins_diagenesis"))) {
                    properties.add(new Property(param, request.queryParams(param)));
                }
            });

            properties.add(new Property("Grain_Types", stoneRecording.getGrainTypes()));
            properties.add(new Property("Cement", stoneRecording.getCement()));
            properties.add(new Property("Veins_diagenesis", stoneRecording.getVeinsDiagenesis()));
            pw.println(stoneRecording.toCSV());
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        model.put("properties", properties);
        return ViewUtil.render(request, model, "/velocity/recordedstone.vm");
    };

    public static Route submitStone = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        request.queryParams().forEach(param -> {
            model.put(param, request.queryParams(param));
        });
        return ViewUtil.render(request, model, "/velocity/submitstone.vm");
    };

    /*
     * Retrieve the appropriate map for the type selected
     */
    public static Route getMap = (Request request, Response response) -> {
        Hashtable<String, TypeMap> typesMaps = DataController.getTypeMaps();
        String type = request.queryParams("type");
        TypeMap typeMap = typesMaps.get(type);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String returnVal = gson.toJson(typeMap);

        return returnVal.toString();
    };

    /*
    * 
    */
    public static Route getStructure = (Request request, Response response) -> {
        String siteNo;
        String retval = "";
        try {
            if (request.queryParams("struct") != null) {
                siteNo = request.queryParams("struct");
                CoreRecord coreRecord = DataController.getCoreRecords().get(siteNo);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                retval = gson.toJson(coreRecord, CoreRecord.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retval;
    };

    public static Route fetchHelp = (Request request, Response response) -> {
        // response.type("application/json");
        String retVal = "";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonfile = "data/help/" + request.queryParams("value") + ".json";
        try {
            Reader reader = Files.newBufferedReader(Paths.get(jsonfile));
            Help help = gson.fromJson(reader, Help.class);
            StringBuilder sb = new StringBuilder();
            help.getHelpData().forEach(helpData -> {
                sb.append(
                        "<div style=\"padding: 10px 10px 10px 10px;\"><div style=\"font-style:italic; font-size: small\">"
                                + helpData.getKey() + "</div>");
                sb.append("<div style=\"font-size: small\">" + helpData.getValue() + "</div></div>");
            });

            retVal = sb.toString();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retVal;
    };

}
