
package uk.ac.ncl.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coord {

    @SerializedName("shape")
    @Expose
    private String shape;
    @SerializedName("coords")
    @Expose
    private String coords;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("struct")
    @Expose
    private String struct;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStruct() {
        return struct;
    }

    public void setStruct(String struct) {
        this.struct = struct;
    }

}
