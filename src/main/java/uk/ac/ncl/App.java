package uk.ac.ncl;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;
import static spark.debug.DebugScreen.enableDebugScreen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.ncl.DAO.DataController;
import uk.ac.ncl.index.IndexController;

/**
 * Hello world!
 *
 */
public class App {
	static Logger logger = LoggerFactory.getLogger(App.class);
    static int port = 4567;

    public static void main(String[] args) {
        DataController.getInstance();
        //dataControl.convertToJSON();
        staticFiles.header("Access-Control-Allow-Origin", "*");
        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();
        port(port);
        get("/", IndexController.serveIndexPage);
        post("/submitstone", IndexController.submitStone);
        post("/maps", IndexController.getMap);
        post("/struct", IndexController.getStructure);
    }
}
