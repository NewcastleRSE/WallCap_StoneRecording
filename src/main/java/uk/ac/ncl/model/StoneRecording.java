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

    /**
     * @return the eID
     */
    public Integer geteID() {
        return eID;
    }

    /**
     * @param eID the eID to set
     */
    public void seteID(Integer eID) {
        this.eID = eID;
    }

    /**
     * @return the drawing
     */
    public String getDrawing() {
        return drawing;
    }

    /**
     * @param drawing the drawing to set
     */
    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    /**
     * @param siteNo
     * @param eID
     * @param stoneRef
     * @param face
     * @param course
     * @param element
     * @param length
     * @param height
     * @param depth
     * @param diameter
     * @param colour
     * @param grainSize
     * @param grainShape
     * @param grainRoundness
     * @param grainSorting
     * @param grainTypes
     * @param cement
     * @param veinsDiagenesis
     * @param sedimentaryTextures
     * @param beddingScale
     * @param fossils
     * @param fossilPhoto
     * @param broadGeology
     * @param lewisHole
     * @param reused
     * @param masonsMark
     * @param tooling
     * @param notesComments
     * @param photographList
     * @param drawing
     * @param recordedBy
     * @param checkedBy
     * @param dateCreated
     * @param lastModified
     * @param recordComplete
     * @param facePath
     * @param leftPath
     * @param rightPath
     * @param reversePath
     * @param topPath
     * @param basePath
     * @param siteElement
     */
    public StoneRecording(Integer siteNo, Integer eID, String stoneRef, String face, String course, String element,
            String length, String height, String depth, String diameter, String colour, String grainSize,
            String grainShape, String grainRoundness, String grainSorting, String grainTypes, String cement,
            String veinsDiagenesis, String sedimentaryTextures, Integer beddingScale, String fossils,
            String fossilPhoto, String broadGeology, Integer lewisHole, Integer reused, Integer masonsMark,
            String tooling, String notesComments, String photographList, String drawing, String recordedBy,
            String checkedBy, String dateCreated, String lastModified, Integer recordComplete, String facePath,
            String leftPath, String rightPath, String reversePath, String topPath, String basePath,
            String siteElement) {
        this.siteNo = siteNo;
        this.eID = eID;
        this.stoneRef = stoneRef;
        this.face = face;
        this.course = course;
        this.element = element;
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.diameter = diameter;
        this.colour = colour;
        this.grainSize = grainSize;
        this.grainShape = grainShape;
        this.grainRoundness = grainRoundness;
        this.grainSorting = grainSorting;
        this.grainTypes = grainTypes;
        this.cement = cement;
        this.veinsDiagenesis = veinsDiagenesis;
        this.sedimentaryTextures = sedimentaryTextures;
        this.beddingScale = beddingScale;
        this.fossils = fossils;
        this.fossilPhoto = fossilPhoto;
        this.broadGeology = broadGeology;
        this.lewisHole = lewisHole;
        this.reused = reused;
        this.masonsMark = masonsMark;
        this.tooling = tooling;
        this.notesComments = notesComments;
        this.photographList = photographList;
        this.drawing = drawing;
        this.recordedBy = recordedBy;
        this.checkedBy = checkedBy;
        this.dateCreated = dateCreated;
        this.lastModified = lastModified;
        this.recordComplete = recordComplete;
        this.facePath = facePath;
        this.leftPath = leftPath;
        this.rightPath = rightPath;
        this.reversePath = reversePath;
        this.topPath = topPath;
        this.basePath = basePath;
        this.siteElement = siteElement;
    }

    /**
     * 
     */
    public StoneRecording() {
    }

    public String toCSV() {
        return siteNo + "," + eID + "," + stoneRef + "," + face + "," + course + "," + element + "," + length + ","
                + height + "," + depth + "," + diameter + "," + colour + "," + grainSize + "," + grainShape + ","
                + grainRoundness + "," + grainSorting + "," + grainTypes + "," + cement + "," + veinsDiagenesis + ","
                + sedimentaryTextures + "," + beddingScale + "," + fossils + "," + fossilPhoto + "," + broadGeology
                + "," + lewisHole + "," + reused + "," + masonsMark + "," + tooling + "," + notesComments + ","
                + photographList + "," + drawing + "," + recordedBy + "," + checkedBy + "," + dateCreated + ","
                + lastModified + "," + recordComplete + "," + facePath + "," + leftPath + "," + rightPath + ","
                + reversePath + "," + topPath + "," + basePath + "," + siteElement;
    }

}