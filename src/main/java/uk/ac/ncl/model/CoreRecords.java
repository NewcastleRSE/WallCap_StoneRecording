package uk.ac.ncl.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoreRecords {

    @SerializedName("corerecords")
    @Expose
    private List<CoreRecord> corerecords = null;

    public List<CoreRecord> getCorerecords() {
        return corerecords;
    }

    public void setCorerecords(List<CoreRecord> corerecords) {
        this.corerecords = corerecords;
    }

    /**
     * 
     */
    public CoreRecords() {
        corerecords = new ArrayList<>();
    }

}