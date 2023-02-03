/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
class Bob {
    public String hey(String input){
        String sentence = input.trim();
        
        if(sentence.isEmpty()){
            return "Fine. Be that way!";
        } 
        
        boolean isAllUpperCase = isAllUpperCase(sentence);
        boolean isQuestion = isQuestion(sentence);

        if (isAllUpperCase && isQuestion) {
            return "Calm down, I know what I'm doing!";
        } else if (isAllUpperCase && !isQuestion){
            return "Whoa, chill out!";
        } else if (isQuestion){
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

    private boolean isAllUpperCase(String input){
        return input == input.toUpperCase() && input.chars().anyMatch(Character::isAlphabetic);
    }

    private boolean isQuestion(String input){
        return input.charAt(input.length()-1) == '?';
    }
    
}
