package ac.uk.ncl.util;

import lombok.Getter;

public class Path {
    
    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    public static class Web {
        @Getter public static final String INDEX = "/index/";
        @Getter public static final String STONE = "/submitstone";
        @Getter public static final String MAPS = "/maps";
        @Getter public static final String TEMP = "/temp";
    }

    public static class Template {
        public final static String INDEX="/velocity/index.vm";
        public final static String INDSTONEEX="/velocity/submitstone.vm";
        public final static String MAPS="/velocity/maps.vm";
    }
}
