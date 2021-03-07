package uk.ac.ncl.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Help {

    @SerializedName("help_data")
    @Expose
    private List<HelpData> helpData = null;

    public List<HelpData> getHelpData() {
        return helpData;
    }

    public void setHelpData(List<HelpData> helpData) {
        this.helpData = helpData;
    }

}