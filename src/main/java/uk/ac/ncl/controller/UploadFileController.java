package uk.ac.ncl.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spark.Request;

public class UploadFileController {
    private static Logger logger = LoggerFactory.getLogger(UploadFileController.class);

	/**
	 * 
	 * @param req
	 * @return
	 */
	public static String uploadFile(Request req, String STORAGE) {
		logger.debug("ENTERED HERE:");
		String uploadedFileName = null;
		// TO allow for multipart file uploads
		req.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement(""));
		try {
			// "uploaded_file" is the key of the form data with the file itself being the value
			Part filePart = req.raw().getPart("uploaded_file");
			logger.debug("FILE TO UPLOAD: ");// + filePart.getName());
			// The name of the file that was uploaded
			uploadedFileName = filePart.getSubmittedFileName();
			InputStream stream = filePart.getInputStream();

			// Write stream to file under storage folder
			Files.copy(stream, Paths.get(STORAGE).resolve(uploadedFileName), StandardCopyOption.REPLACE_EXISTING);
			stream.close();
		} catch (IOException | ServletException e) {
			return "Exception occurred while uploading file" + e.getMessage();
		}
		if (uploadedFileName.endsWith(".png")) {
			return "<h1>You uploaded this image:<h1><img src='" + uploadedFileName + "'>";
		} else {
			return "File " + uploadedFileName + " uploaded successfully.";
		}
	}

}
