import java.util.HashMap;
import java.util.Map;

class WordCount {
    //regex means that all words are not characters which convert to whitespace
    public static final String REGEX = "[^A-Za-z0-9']|'\\B|\\B'";

    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> storeValue = new HashMap<String, Integer>();
        //convert special characters to whitespace
        //regex '\\s+': matches sequence of one or more whitespace characters
        input = input.replaceAll(REGEX," ");
        String []words = input.toLowerCase().split("\\s+");
        
        for(String key : words){
            if(!key.isEmpty()){
                storeValue.put(key, storeValue.getOrDefault(key, 0) + 1);        
            }
        }

        return storeValue;
    }
}
