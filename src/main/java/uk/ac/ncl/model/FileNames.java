package uk.ac.ncl.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FileNames {

    @SerializedName("FileNames")
    @Expose
    private List<FileName> filenames = null;

    /**
     * @return the typeMaps
     */
    public List<FileName> getFileNames() {
        return filenames;
    }

    /**
     * @param typeMaps the typeMaps to set
     */
    public void setFileNames(List<FileName> filenames) {
        this.filenames = filenames;
    }

    
}
