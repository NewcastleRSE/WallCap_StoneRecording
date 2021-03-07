package uk.ac.ncl.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.ncl.model.Help;
import uk.ac.ncl.model.CoreRecord;
import uk.ac.ncl.model.CoreRecords;
import uk.ac.ncl.model.TypeMap;
import uk.ac.ncl.model.TypeMaps;

public class DataController {
    static Logger logger = LoggerFactory.getLogger(DataController.class);
    private static Hashtable<String, CoreRecord> coreRecords = new Hashtable<>();
    private static Hashtable<String, TypeMap> typeMaps = new Hashtable<>();
    private static DataController dataController;
    String jsonfile = "data/B_Core_Data.json";
    String csvfile = "data/B_Core_Data.csv";
    static String typeMapsfile = "data/TypeMaps.json";

    private DataController() {

    }

    public static DataController getInstance() {
        if (dataController == null) {
            dataController = new DataController();
            typeMaps = loadTypesMaps();
        }
        // Load records from json datafile
        CoreRecords coreRecords = dataController.loadCoreRecordsFromJSON();
        for (CoreRecord coreRecord : coreRecords.getCorerecords()) {
            DataController.coreRecords.put(coreRecord.getSite_No(), coreRecord);
        }
        return dataController;
    }

    public CoreRecords loadCoreRecordsFromCSV() {
        File file = new File(csvfile);
        CoreRecords records = new CoreRecords();
        try {
            // open csv file
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (!line.equals("")) {
                    String[] tokens = line.split(",");
                    CoreRecord coreRecord = new CoreRecord(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4],
                            tokens[5], tokens[6], tokens[7], tokens[8], tokens[9], tokens[10], tokens[11], tokens[12],
                            tokens[13], tokens[14], tokens[15], tokens[16], tokens[17]);
                    records.getCorerecords().add(coreRecord);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return records;
    }

    private static Hashtable<String, TypeMap> loadTypesMaps() {
        Hashtable<String, TypeMap> hsh_typeMaps = new Hashtable<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileReader fr = new FileReader(typeMapsfile);
            TypeMaps typeMaps = gson.fromJson(fr, TypeMaps.class);
            typeMaps.getTypeMaps().forEach(v -> {hsh_typeMaps.put(v.getType(), v);});
            fr.close();
        } catch (JsonSyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonIOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return hsh_typeMaps;
    }

    private CoreRecords loadCoreRecordsFromJSON() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        CoreRecords coreRecords;
        try {
            File f = new File(jsonfile);
            // If json file does not exist, create it and import data
            if (!f.exists()) {
                // Read csv into list structure
                coreRecords = loadCoreRecordsFromCSV();
                logger.debug("LOADED " + coreRecords.getCorerecords().size() + " RECORDS");
                try {
                    // write list structure to json file
                    FileWriter fw = new FileWriter(f);
                    gson.toJson(coreRecords, fw);
                    fw.close();
                } catch (JsonIOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // Now the file should exist
            }
            Reader reader = Files.newBufferedReader(Paths.get(jsonfile));
            coreRecords = gson.fromJson(reader, CoreRecords.class);
            return coreRecords;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

        // convert JSON string to User object
        // coreRecords = gson.toJson(reader, HashMap.class);
    }

    public String convertToJSON() {
        File file = new File(jsonfile);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(coreRecords);
        try {
            FileWriter fw = new FileWriter(file);
            gson.toJson(coreRecords, fw);
            fw.close();
        } catch (JsonIOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        }
        return json;
    }

    /**
     * @return the coreRecords
     */
    public static Hashtable<String, CoreRecord> getCoreRecords() {
        return coreRecords;
    }

    /**
     * @param coreRecords the coreRecords to set
     */
    public static void setCoreRecords(Hashtable<String, CoreRecord> coreRecords) {
        DataController.coreRecords = coreRecords;
    }

    /**
     * @return the typeMaps
     */
    public static Hashtable<String, TypeMap> getTypeMaps() {
        return typeMaps;
    }

    /**
     * @param typeMaps the typeMaps to set
     */
    public static void setTypeMaps(Hashtable<String, TypeMap> typeMaps) {
        DataController.typeMaps = typeMaps;
    }

}
