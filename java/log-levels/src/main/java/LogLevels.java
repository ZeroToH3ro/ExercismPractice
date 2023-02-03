public class LogLevels {
    public static final String[] logLevelDeclare = {"ERROR", "WARNING", "INFO"};

    public static String message(String logLine) {
        String []subStr = logLine.split(":");
        return subStr[1].trim();

    }

    public static String logLevel(String logLine) {
       String []subStr = logLine.split(":");
       String result = "";
       for (var character : logLevelDeclare){
            if (subStr[0].contains(character)){
                result = character;
            }
       }
       return result.toLowerCase();
    }

    public static String reformat(String logLine) {
        String result = message(logLine) + " ("+ logLevel(logLine) +")";
        return result;
    }
}
