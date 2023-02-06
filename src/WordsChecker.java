
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    public String hasWord;
    protected String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] word = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, word);
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
