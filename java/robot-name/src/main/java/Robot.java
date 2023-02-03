import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Robot {
    //* Declare sequences LETTERS to select */
    private static char[] LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static Stack<String> unusedNames = generateNames();
    
    public static Stack<String> generateNames() {
        List<String> allNames = new ArrayList<>();
        //* Step 1: Generate random string according to format */
        for(char firstChar : LETTERS) {
            for(char secondChar : LETTERS) {
                for(int i=0; i< 1_000; ++i){
                    allNames.add(firstChar+""+secondChar+String.format("%03d", i));
                }
            }
        }
        //* Step 2: Generate random string */
        Collections.shuffle(allNames);
        //* Step 3: Store all random string into stack */
        Stack<String> shuffledNames = new Stack<>();
        shuffledNames.addAll(allNames);
        return shuffledNames;
    }

    //! Declare variables to store random name for robot
    private String name;

    public String getName() {
        return name;
    }

    public Robot(){
        reset();
    }
    //* Step 4: Reset name whenever to reset robot  */
    public void reset() throws EmptyStackException{
        name = unusedNames.pop();
    }
}