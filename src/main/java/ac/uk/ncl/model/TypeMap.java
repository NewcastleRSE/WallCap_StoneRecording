package ac.uk.ncl.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeMap {

    @Expose
    @SerializedName("type")
    String type;

    @Expose
    @SerializedName("image")
    String image;

    /**
     * @param type
     * @param image
     */
    public TypeMap(String type, String image) {
        this.type = type;
        this.image = image;
    }    
    
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }


    
}
