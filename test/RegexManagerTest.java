import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexManagerTest {

    @Test
    public void testEmptyCase(){
        WordsController words = new WordsController();
        System.out.println(words.deleteWordsWithMoreVowels(""));
        assertEquals(" ",words.deleteWordsWithMoreVowels(""));
    }

    @Test
    public void testRegularCase(){
        WordsController words = new WordsController();
        assertEquals("Hello world, it is interesting lab, innit? ",words.deleteWordsWithMoreVowels("Hello world, it is quite interesting lab, innit?"));
    }

}
