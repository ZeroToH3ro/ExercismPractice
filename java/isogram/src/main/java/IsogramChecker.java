import java.util.HashMap;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        HashMap<Character, Boolean> charCheck = new HashMap<Character, Boolean>();
        boolean result = true;
        phrase = phrase.toLowerCase();
                
        for(Character c : phrase.toCharArray()){
            if(!Character.isLetter(c)){
                continue;
            }
            if(charCheck.containsKey(c)){
                result = false;
            } else {
                charCheck.put(c, false);
            }
        }
        return result;
    }
}






