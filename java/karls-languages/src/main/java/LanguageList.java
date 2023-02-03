import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty() ? true : false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String result = languages.get(0);
        return result;
    }

    public int count() {
        int result = languages.size();
        return result;
    }

    public boolean containsLanguage(String language) {
       return languages.contains(language) ? true : false;
    }

    public boolean isExciting() {
        return this.containsLanguage("Java") || this.containsLanguage("Kotlin");
    }
}
