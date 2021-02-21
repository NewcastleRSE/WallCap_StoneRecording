package uk.ac.ncl.index;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.crypto.Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spark.Request;
import spark.Response;
import spark.Route;
import uk.ac.ncl.DAO.DataController;
import uk.ac.ncl.model.CoreRecord;
import uk.ac.ncl.model.TypeMap;
import uk.ac.ncl.util.ViewUtil;

public class IndexController {
    static Logger logger = LoggerFactory.getLogger(IndexController.class);
    public static Route serveIndexPage = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, "/velocity/index.vm");

    };

    public static Route submitStone = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        request.queryParams().forEach(param -> {
            model.put(param, request.queryParams(param));
        });
        return ViewUtil.render(request, model, "/velocity/submitstone.vm");
    };

    /*
    Retrieve the appropriate map for the type selected
     */
    public static Route getMap = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        Hashtable<String, TypeMap> typesMaps = DataController.getTypeMaps();
        String type = request.queryParams("type");
        TypeMap typeMap = typesMaps.get(type);
        String map = typeMap.getType();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String returnVal = gson.toJson(typeMap);
    
        
        return returnVal.toString();
    };

    public static Route getStructure = (Request request, Response response) -> {
        Hashtable<String, Object> model = new Hashtable<>();
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

    public static Route getTemp = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, "/velocity/temp.vm");
    };

}
