package ac.uk.ncl.util;

import spark.*;

public class RequestUtil {

    public static String getQueryLocale(Request request) {
        return request.queryParams("locale");
    }

    }
