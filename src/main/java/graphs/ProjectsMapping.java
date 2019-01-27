package graphs;

/**
 * Created by aohana
 */
public class ProjectsMapping {

    public static Integer getMapping(String project) {
        switch (project) {
            case "a":
                return 0;
            case "b":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
            case "e":
                return 4;
            case "f":
                return 5;
            default:
                return 0;
        }
    }

    public static String getMapping(Integer project) {
        switch (project) {
            case 0:
                return "a";
            case 1:
                return "b";
            case 2:
                return "c";
            case 3:
                return "d";
            case 4:
                return "e";
            case 5:
                return "f";
            default:
                return "a";
        }
    }
}
