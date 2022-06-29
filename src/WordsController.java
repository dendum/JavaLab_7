import java.util.ArrayList;
import java.util.List;

public class WordsController {

    public String deleteWordsWithMoreVowels(String str){
        String[] sentence = str.split("\\s+");
        List<String> keep = new ArrayList<>();
        for (String word : sentence) {
            int numberOfSpecialSymbols = word.length()-word.replaceAll("([\\.\\?!,])","").length();
            int numberOfConsonants = word.replaceAll("(?i:[aeiou])","").length() - numberOfSpecialSymbols;
            if (word.length()-numberOfConsonants <= numberOfConsonants) {
                keep.add(word);
            }
        }
        StringBuilder result = new StringBuilder();
        keep.forEach(s -> result.append(s).append(" "));
        return result.toString();
    }
}
