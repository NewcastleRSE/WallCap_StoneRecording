package ac.uk.ncl.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeMaps {

    @SerializedName("typeMaps")
    @Expose
    private List<TypeMap> typeMaps = null;

    public List<TypeMap> getTypeMaps() {
        return typeMaps;
    }

    public void setTypeMaps(List<TypeMap> typeMaps) {
        this.typeMaps = typeMaps;
    }

}