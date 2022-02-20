public class LogLevels {
    
    public static String message(String logLine) {
        //separates the string message into two from the colon
        String[] res = logLine.split(":");
        //trim removes all the spaces
        return res[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] res = logLine.split(":");
        String logLevel = res[0].toLowerCase();
        String subString = logLevel.substring(1, logLevel.length()-1);

        return subString;
    }

    public static String reformat(String logLine) {
        String[] res = logLine.split(":");
        String subString = res[0].toLowerCase();
        String logLevel = res[1].trim() + " " + "(" + subString.substring(1, res[0].length()-1) + ")";
        String reformat = logLevel.trim();

        return reformat ;
    }
}
