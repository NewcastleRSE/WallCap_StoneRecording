package ac.uk.ncl;

import static spark.Spark.before;
import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;
import static spark.debug.DebugScreen.enableDebugScreen;

import ac.uk.ncl.index.IndexController;
import ac.uk.ncl.util.ViewUtil;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        staticFiles.header("Access-Control-Allow-Origin", "*");
        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();
        port(4567);
		get("/", IndexController.serveIndexPage);
        post("/submitstone", IndexController.submitStone);
        post("/maps", IndexController.getMap);
        get("/temp", IndexController.getTemp);
    }
}
