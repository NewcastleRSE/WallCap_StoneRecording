package uk.ac.ncl;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;
import static spark.debug.DebugScreen.enableDebugScreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.ncl.DAO.DataController;
import uk.ac.ncl.controller.UploadFileController;
import uk.ac.ncl.index.IndexController;

/**
 * Hello world!
 *
 */
public class App {
	static Logger logger = LoggerFactory.getLogger(App.class);
	private static String STORAGE;
	private static int PORT = getHerokuAssignedPort();
	static private Properties properties = null;

    public static void main(String[] args) {
		properties = loadProperties();
		STORAGE = properties.getProperty("STORAGE");
		File storageDir = new File(STORAGE);
		if (!storageDir.isDirectory())
			storageDir.mkdir();
        DataController.getInstance();
        //dataControl.convertToJSON();
        staticFiles.header("Access-Control-Allow-Origin", "*");
        staticFiles.location("/public");
        staticFiles.externalLocation("externalpublic");
        staticFiles.expireTime(600L);
        enableDebugScreen();
        port(PORT);
		post("/upload", (req, res) -> UploadFileController.uploadFile(req, STORAGE));
		get("/download/:file", (req, res) -> downloadFile(req.params(":file")));
        get("/", IndexController.serveIndexPage);
        post("/submitstone", IndexController.submitStone);
        post("/maps", IndexController.getMap);
        post("/struct", IndexController.getStructure);
        post("/recordstone", (req, res) -> IndexController.recordstone(req, res));
        post("/fetchHelp", IndexController.fetchHelp);
    }

    /**
     * https://sparktutorials.github.io/2015/08/24/spark-heroku.html
     * @return
     */
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    /**
     * Load properties from system.properties file
     * 
     * @return
     */
    public static Properties loadProperties() {
        properties = new Properties();
        try {
            File f = new File("system.properties");
            // If the file doesn't exist, create it
            OutputStream out;
            if (!(f.exists())) {
                out = new FileOutputStream(f);
                out.close();
            }
            InputStream is = new FileInputStream(f);
            properties.load(is);
            // If there are no properties yet, set STORAGE to the default value of /upload
            if (properties.size() == 0) {
                properties.setProperty("STORAGE", "upload");
                properties.setProperty("PGPORT", "4567");
                properties.setProperty("PGHOST", "postgres");
            }
            FileOutputStream os = new FileOutputStream("system.properties");
            properties.store(os, "");
            // String STORAGE = properties.getProperty("STORAGE");
            // int PORT = Integer.valueOf(properties.getProperty("PGPORT"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

	private static String downloadFile(String fileName) {
		Path filePath = Paths.get(STORAGE).resolve(fileName);
		File file = filePath.toFile();
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (file.exists()) {
			try {
				// Read from file and join all the lines into a string
				return Files.readAllLines(filePath).stream().collect(Collectors.joining());
			} catch (IOException e) {
				return "Exception occurred while reading file" + e.getMessage();
			}
		}
		return "File doesn't exist. Cannot download";
	}
}
