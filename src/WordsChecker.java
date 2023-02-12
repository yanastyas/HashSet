
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String hasWord;
    protected String text;
    protected Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        set = new HashSet<>();
        String[] word = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, word);
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
