class SqueakyClean {
    static String clean(String identifier){
        StringBuilder result = new StringBuilder();

        if(identifier.contains("-")){
            String []firstStrTemp = identifier.split("-");
            String []secondStrTemp = new String[firstStrTemp.length];
            
            for(int i=0; i<firstStrTemp.length; ++i){
                if(i == 0){
                    secondStrTemp[i] = firstStrTemp[i];
                } 
                if (i > 0){
                    secondStrTemp[i] = firstStrTemp[i].substring(0,1).toUpperCase() + firstStrTemp[i].substring(1);
                }
            }
            for(int i=0; i<secondStrTemp.length; ++i){
                result.append(secondStrTemp[i]);
            }
            return preClean(result.toString());
        } else{
            return preClean(identifier);
        }
    }

    static String preClean(String identifier) {
        StringBuilder result = new StringBuilder();
        //convert string into char array
        char[] valueTemporary = identifier.toCharArray(); 
        for(int i=0; i<valueTemporary.length; i++){
            if(Character.isWhitespace(valueTemporary[i])){
                valueTemporary[i] = '_';
                result.append(valueTemporary[i]);
                continue;
            }
            if(Character.isISOControl(valueTemporary[i])){
                result.append("CTRL");
                continue;
            }
            if((valueTemporary[i] > 'ά') && (valueTemporary[i] < 'ώ')){
                continue;
            }
            if((valueTemporary[i] >= 0) && (valueTemporary[i] <= 9)){
                continue;
            }
            if(Character.isLetter(valueTemporary[i])){
                result.append(valueTemporary[i]);
                continue;
            }
        }
        return result.toString();
    }
}
