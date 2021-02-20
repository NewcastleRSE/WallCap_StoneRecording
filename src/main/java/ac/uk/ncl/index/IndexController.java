package ac.uk.ncl.index;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ac.uk.ncl.DAO.DataController;
import ac.uk.ncl.model.CoreRecord;
import ac.uk.ncl.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

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
        String type = request.queryParams("type");
        request.queryParams().forEach(param -> {
            model.put(param, request.queryParams(param));
        });
        response.type("application/json");
        return "{\"img\": \"images/maps/Forts_on_Wall_small.jpg\"}";
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
