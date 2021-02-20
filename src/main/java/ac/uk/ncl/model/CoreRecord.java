package ac.uk.ncl.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoreRecord {
    static Logger logger = LoggerFactory.getLogger(CoreRecord.class);
    @Expose
    @SerializedName("Site_No")
    String Site_No;
    @Expose
    @SerializedName("Site_Name")
    String Site_Name;
    @Expose
    @SerializedName("County")
    String County;
    @Expose
    @SerializedName("Parish")
    String Parish;
    @Expose
    @SerializedName("OS_Grid_Ref")
    String OS_Grid_Ref;
    @Expose
    @SerializedName("Wall_Mile")
    String Wall_Mile;
    @Expose
    @SerializedName("HER_No")
    String HER_No;
    @Expose
    @SerializedName("Monument_No")
    String Monument_No;
    @Expose
    @SerializedName("NMR_No")
    String NMR_No;
    @Expose
    @SerializedName("Building_No")
    String Building_No;
    @Expose
    @SerializedName("Date_of_Survey")
    String Date_of_Survey;
    @Expose
    @SerializedName("Surveyors")
    String Surveyors;
    @Expose
    @SerializedName("Checked_by")
    String Checked_by;
    @Expose
    @SerializedName("Type_of_Structure")
    String Type_of_Structure;
    @Expose
    @SerializedName("Date_of_Structure")
    String Date_of_Structure;
    @Expose
    @SerializedName("Stonework_Element")
    String Stonework_Element;
    @Expose
    @SerializedName("Scale")
    String Scale;
    @Expose
    @SerializedName("Description")
    String Description;

    /**
     * @param site_No
     * @param site_Name
     * @param county
     * @param parish
     * @param oS_Grid_Ref
     * @param wall_Mile
     * @param hER_No
     * @param monument_No
     * @param nMR_No
     * @param building_No
     * @param date_of_Survey
     * @param surveyors
     * @param checked_by
     * @param type_of_Structure
     * @param date_of_Structure
     * @param stonework_Element
     * @param scale
     * @param description
     */
    public CoreRecord(String site_No, String site_Name, String county, String parish, String oS_Grid_Ref,
            String wall_Mile, String hER_No, String monument_No, String nMR_No, String building_No,
            String date_of_Survey, String surveyors, String checked_by, String type_of_Structure,
            String date_of_Structure, String stonework_Element, String scale, String description) {
        Site_No = site_No;
        Site_Name = site_Name;
        County = county;
        Parish = parish;
        OS_Grid_Ref = oS_Grid_Ref;
        Wall_Mile = wall_Mile;
        HER_No = hER_No;
        Monument_No = monument_No;
        NMR_No = nMR_No;
        Building_No = building_No;
        Date_of_Survey = date_of_Survey;
        Surveyors = surveyors;
        Checked_by = checked_by;
        Type_of_Structure = type_of_Structure;
        Date_of_Structure = date_of_Structure;
        Stonework_Element = stonework_Element;
        Scale = scale;
        Description = description;
    }

    /**
     * @return the site_No
     */
    public String getSite_No() {
        return Site_No;
    }

    /**
     * @param site_No the site_No to set
     */
    public void setSite_No(String site_No) {
        Site_No = site_No;
    }

    /**
     * @return the site_Name
     */
    public String getSite_Name() {
        return Site_Name;
    }

    /**
     * @param site_Name the site_Name to set
     */
    public void setSite_Name(String site_Name) {
        Site_Name = site_Name;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return County;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        County = county;
    }

    /**
     * @return the parish
     */
    public String getParish() {
        return Parish;
    }

    /**
     * @param parish the parish to set
     */
    public void setParish(String parish) {
        Parish = parish;
    }

    /**
     * @return the oS_Grid_Ref
     */
    public String getOS_Grid_Ref() {
        return OS_Grid_Ref;
    }

    /**
     * @param oS_Grid_Ref the oS_Grid_Ref to set
     */
    public void setOS_Grid_Ref(String oS_Grid_Ref) {
        OS_Grid_Ref = oS_Grid_Ref;
    }

    /**
     * @return the wall_Mile
     */
    public String getWall_Mile() {
        return Wall_Mile;
    }

    /**
     * @param wall_Mile the wall_Mile to set
     */
    public void setWall_Mile(String wall_Mile) {
        Wall_Mile = wall_Mile;
    }

    /**
     * @return the hER_No
     */
    public String getHER_No() {
        return HER_No;
    }

    /**
     * @param hER_No the hER_No to set
     */
    public void setHER_No(String hER_No) {
        HER_No = hER_No;
    }

    /**
     * @return the monument_No
     */
    public String getMonument_No() {
        return Monument_No;
    }

    /**
     * @param monument_No the monument_No to set
     */
    public void setMonument_No(String monument_No) {
        Monument_No = monument_No;
    }

    /**
     * @return the nMR_No
     */
    public String getNMR_No() {
        return NMR_No;
    }

    /**
     * @param nMR_No the nMR_No to set
     */
    public void setNMR_No(String nMR_No) {
        NMR_No = nMR_No;
    }

    /**
     * @return the building_No
     */
    public String getBuilding_No() {
        return Building_No;
    }

    /**
     * @param building_No the building_No to set
     */
    public void setBuilding_No(String building_No) {
        Building_No = building_No;
    }

    /**
     * @return the date_of_Survey
     */
    public String getDate_of_Survey() {
        return Date_of_Survey;
    }

    /**
     * @param date_of_Survey the date_of_Survey to set
     */
    public void setDate_of_Survey(String date_of_Survey) {
        Date_of_Survey = date_of_Survey;
    }

    /**
     * @return the surveyors
     */
    public String getSurveyors() {
        return Surveyors;
    }

    /**
     * @param surveyors the surveyors to set
     */
    public void setSurveyors(String surveyors) {
        Surveyors = surveyors;
    }

    /**
     * @return the checked_by
     */
    public String getChecked_by() {
        return Checked_by;
    }

    /**
     * @param checked_by the checked_by to set
     */
    public void setChecked_by(String checked_by) {
        Checked_by = checked_by;
    }

    /**
     * @return the type_of_Structure
     */
    public String getType_of_Structure() {
        return Type_of_Structure;
    }

    /**
     * @param type_of_Structure the type_of_Structure to set
     */
    public void setType_of_Structure(String type_of_Structure) {
        Type_of_Structure = type_of_Structure;
    }

    /**
     * @return the date_of_Structure
     */
    public String getDate_of_Structure() {
        return Date_of_Structure;
    }

    /**
     * @param date_of_Structure the date_of_Structure to set
     */
    public void setDate_of_Structure(String date_of_Structure) {
        Date_of_Structure = date_of_Structure;
    }

    /**
     * @return the stonework_Element
     */
    public String getStonework_Element() {
        return Stonework_Element;
    }

    /**
     * @param stonework_Element the stonework_Element to set
     */
    public void setStonework_Element(String stonework_Element) {
        Stonework_Element = stonework_Element;
    }

    /**
     * @return the scale
     */
    public String getScale() {
        return Scale;
    }

    /**
     * @param scale the scale to set
     */
    public void setScale(String scale) {
        Scale = scale;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        Description = description;
    }

}
