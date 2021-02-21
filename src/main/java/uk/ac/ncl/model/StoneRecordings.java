package uk.ac.ncl.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoneRecordings {

    @SerializedName("StoneRecordings")
    @Expose
    private List<StoneRecording> stoneRecordings = null;

    public List<StoneRecording> getStoneRecordings() {
        return stoneRecordings;
    }

    public void setStoneRecordings(List<StoneRecording> stoneRecordings) {
        this.stoneRecordings = stoneRecordings;
    }

}