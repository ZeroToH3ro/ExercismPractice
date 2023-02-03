import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private final String word;

    public Anagram(String word) {

        this.word = word;

    }

    public List<String> match(List<String> strings) {

        char[] wordCharacters = word.toLowerCase().toCharArray();

        Arrays.sort(wordCharacters);

        ArrayList<String> result = new ArrayList<>();

        for (String string : strings) {

            if (word.equalsIgnoreCase(string)) {

                continue;

            }

            char[] characters = string.toLowerCase().toCharArray();

            Arrays.sort(characters);

            if (Arrays.equals(wordCharacters, characters)) {

                result.add(string);

            }

        }

        return result;

    }

}