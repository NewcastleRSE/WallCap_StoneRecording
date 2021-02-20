package uk.ac.ncl.StoneRecords;

public class StoneEntry {
    Integer site_number;
    String site_name;
    String county;

    public StoneEntry(Integer site_number, String site_name, String county) {
        this.site_number = site_number;
        this.site_name = site_name;
        this.county = county;
    }

    /**
     * @return the site_number
     */
    public Integer getSite_number() {
        return site_number;
    }

    /**
     * @param site_number the site_number to set
     */
    public void setSite_number(Integer site_number) {
        this.site_number = site_number;
    }

    /**
     * @return the site_name
     */
    public String getSite_name() {
        return site_name;
    }

    /**
     * @param site_name the site_name to set
     */
    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }
    
}
