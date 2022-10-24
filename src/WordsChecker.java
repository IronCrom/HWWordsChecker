import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    // protected String text;
    protected Set<String> textSet;

    public WordsChecker(String text) {
        Set<String> textSet = new HashSet<>(List.of(text.toLowerCase().split("\\P{IsAlphabetic}+")));
        this.textSet = textSet;
        //this.text = text;
    }

    public boolean hasWord(String word) {
//        text = text.toLowerCase();
//        Set<String> textSet = new HashSet<>();
//        textSet.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
        word = word.toLowerCase();
        if (textSet.contains(word)) {
            System.out.println("Данный текст содержит слово " + "\"" + word + "\"!");
        } else {
            System.out.println("Данный текст НЕ содержит слова " + "\"" + word + "\"!");
        }
        return textSet.contains(word);
    }
}
