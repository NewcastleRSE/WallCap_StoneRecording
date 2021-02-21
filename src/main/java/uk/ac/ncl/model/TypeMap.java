package uk.ac.ncl.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeMap {

@SerializedName("type")
@Expose
private String type;
@SerializedName("image")
@Expose
private String image;
@SerializedName("coords")
@Expose
private List<Coord> coords = null;

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public List<Coord> getCoords() {
return coords;
}

public void setCoords(List<Coord> coords) {
this.coords = coords;
}

}