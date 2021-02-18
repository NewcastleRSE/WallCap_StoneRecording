package ac.uk.ncl.index;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ac.uk.ncl.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

public class IndexController {
    public static Route serveIndexPage = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, "/velocity/index.vm");

    };

    public static Route submitStone = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        request.queryParams().forEach(param -> {model.put(param,request.queryParams(param));});
        return ViewUtil.render(request, model, "/velocity/submitstone.vm");
    };

    public static Route getMap = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        request.queryParams().forEach(param -> {model.put(param,request.queryParams(param));});
        return ViewUtil.render(request, model, "/velocity/maps.vm");
    };

    public static Route getTemp = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, "/velocity/temp.vm");
    };

}
