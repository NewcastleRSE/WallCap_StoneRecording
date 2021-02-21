package uk.ac.ncl.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoneRecording {

    @SerializedName("Site_No")
    @Expose
    private Integer siteNo;
    @SerializedName("EID")
    @Expose
    private Integer eID;
    @SerializedName("Stone_Ref")
    @Expose
    private String stoneRef;
    @SerializedName("Face")
    @Expose
    private String face;
    @SerializedName("Course")
    @Expose
    private String course;
    @SerializedName("Element")
    @Expose
    private String element;
    @SerializedName("Length")
    @Expose
    private String length;
    @SerializedName("Height")
    @Expose
    private String height;
    @SerializedName("Depth")
    @Expose
    private String depth;
    @SerializedName("Diameter")
    @Expose
    private String diameter;
    @SerializedName("Colour")
    @Expose
    private String colour;
    @SerializedName("Grain_Size")
    @Expose
    private String grainSize;
    @SerializedName("Grain_Shape")
    @Expose
    private String grainShape;
    @SerializedName("Grain_Roundness")
    @Expose
    private String grainRoundness;
    @SerializedName("Grain_Sorting")
    @Expose
    private String grainSorting;
    @SerializedName("Grain_Types")
    @Expose
    private String grainTypes;
    @SerializedName("Cement")
    @Expose
    private String cement;
    @SerializedName("Veins_diagenesis")
    @Expose
    private String veinsDiagenesis;
    @SerializedName("Sedimentary_textures")
    @Expose
    private String sedimentaryTextures;
    @SerializedName("Bedding_scale")
    @Expose
    private Integer beddingScale;
    @SerializedName("Fossils")
    @Expose
    private String fossils;
    @SerializedName("Fossil photo")
    @Expose
    private String fossilPhoto;
    @SerializedName("Broad_geology")
    @Expose
    private String broadGeology;
    @SerializedName("Lewis_hole")
    @Expose
    private Integer lewisHole;
    @SerializedName("Reused")
    @Expose
    private Integer reused;
    @SerializedName("Masons_mark")
    @Expose
    private Integer masonsMark;
    @SerializedName("Tooling")
    @Expose
    private String tooling;
    @SerializedName("Notes_Comments")
    @Expose
    private String notesComments;
    @SerializedName("Photograph_List")
    @Expose
    private String photographList;
    @SerializedName("Drawing")
    @Expose
    private String drawing;
    @SerializedName("Recorded_by")
    @Expose
    private String recordedBy;
    @SerializedName("Checked_by")
    @Expose
    private String checkedBy;
    @SerializedName("Date_Created")
    @Expose
    private String dateCreated;
    @SerializedName("Last_Modified")
    @Expose
    private String lastModified;
    @SerializedName("Record_complete")
    @Expose
    private Integer recordComplete;
    @SerializedName("face_path")
    @Expose
    private String facePath;
    @SerializedName("left_path")
    @Expose
    private String leftPath;
    @SerializedName("right_path")
    @Expose
    private String rightPath;
    @SerializedName("reverse_path")
    @Expose
    private String reversePath;
    @SerializedName("top_path")
    @Expose
    private String topPath;
    @SerializedName("base_path")
    @Expose
    private String basePath;
    @SerializedName("site_element")
    @Expose
    private String siteElement;

    public Integer getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(Integer siteNo) {
        this.siteNo = siteNo;
    }

    public Integer getEID() {
        return eID;
    }

    public void setEID(Integer eID) {
        this.eID = eID;
    }

    public String getStoneRef() {
        return stoneRef;
    }

    public void setStoneRef(String stoneRef) {
        this.stoneRef = stoneRef;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGrainSize() {
        return grainSize;
    }

    public void setGrainSize(String grainSize) {
        this.grainSize = grainSize;
    }

    public String getGrainShape() {
        return grainShape;
    }

    public void setGrainShape(String grainShape) {
        this.grainShape = grainShape;
    }

    public String getGrainRoundness() {
        return grainRoundness;
    }

    public void setGrainRoundness(String grainRoundness) {
        this.grainRoundness = grainRoundness;
    }

    public String getGrainSorting() {
        return grainSorting;
    }

    public void setGrainSorting(String grainSorting) {
        this.grainSorting = grainSorting;
    }

    public String getGrainTypes() {
        return grainTypes;
    }

    public void setGrainTypes(String grainTypes) {
        this.grainTypes = grainTypes;
    }

    public String getCement() {
        return cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public String getVeinsDiagenesis() {
        return veinsDiagenesis;
    }

    public void setVeinsDiagenesis(String veinsDiagenesis) {
        this.veinsDiagenesis = veinsDiagenesis;
    }

    public String getSedimentaryTextures() {
        return sedimentaryTextures;
    }

    public void setSedimentaryTextures(String sedimentaryTextures) {
        this.sedimentaryTextures = sedimentaryTextures;
    }

    public Integer getBeddingScale() {
        return beddingScale;
    }

    public void setBeddingScale(Integer beddingScale) {
        this.beddingScale = beddingScale;
    }

    public String getFossils() {
        return fossils;
    }

    public void setFossils(String fossils) {
        this.fossils = fossils;
    }

    public String getFossilPhoto() {
        return fossilPhoto;
    }

    public void setFossilPhoto(String fossilPhoto) {
        this.fossilPhoto = fossilPhoto;
    }

    public String getBroadGeology() {
        return broadGeology;
    }

    public void setBroadGeology(String broadGeology) {
        this.broadGeology = broadGeology;
    }

    public Integer getLewisHole() {
        return lewisHole;
    }

    public void setLewisHole(Integer lewisHole) {
        this.lewisHole = lewisHole;
    }

    public Integer getReused() {
        return reused;
    }

    public void setReused(Integer reused) {
        this.reused = reused;
    }

    public Integer getMasonsMark() {
        return masonsMark;
    }

    public void setMasonsMark(Integer masonsMark) {
        this.masonsMark = masonsMark;
    }

    public String getTooling() {
        return tooling;
    }

    public void setTooling(String tooling) {
        this.tooling = tooling;
    }

    public String getNotesComments() {
        return notesComments;
    }

    public void setNotesComments(String notesComments) {
        this.notesComments = notesComments;
    }

    public String getPhotographList() {
        return photographList;
    }

    public void setPhotographList(String photographList) {
        this.photographList = photographList;
    }

    public String getDrawing() {
        return drawing;
    }

    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    public String getRecordedBy() {
        return recordedBy;
    }

    public void setRecordedBy(String recordedBy) {
        this.recordedBy = recordedBy;
    }

    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getRecordComplete() {
        return recordComplete;
    }

    public void setRecordComplete(Integer recordComplete) {
        this.recordComplete = recordComplete;
    }

    public String getFacePath() {
        return facePath;
    }

    public void setFacePath(String facePath) {
        this.facePath = facePath;
    }

    public String getLeftPath() {
        return leftPath;
    }

    public void setLeftPath(String leftPath) {
        this.leftPath = leftPath;
    }

    public String getRightPath() {
        return rightPath;
    }

    public void setRightPath(String rightPath) {
        this.rightPath = rightPath;
    }

    public String getReversePath() {
        return reversePath;
    }

    public void setReversePath(String reversePath) {
        this.reversePath = reversePath;
    }

    public String getTopPath() {
        return topPath;
    }

    public void setTopPath(String topPath) {
        this.topPath = topPath;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getSiteElement() {
        return siteElement;
    }

    public void setSiteElement(String siteElement) {
        this.siteElement = siteElement;
    }

}