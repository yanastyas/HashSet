
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String hasWord;
    protected String text;
    Set<String> set = new HashSet<>();

    protected WordsChecker(String text) {
        this.text = text;
        String[] word = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, word);
    }

    protected boolean hasWord(String word) {
        return set.contains(word);
    }
}
