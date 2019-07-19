import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringJoinerTests {

    private StringsJoiner stringsJoiner;
    private List<String> inputStrings;

//    Join - Joining a list of strings
//    means creating a single new string by
//    concatenating the string in list together with a delimiter between them.
//    For instance, joining the strings {"a", "b”, "c”} on the delimiter ",” would result in the string "a,b,c”.
//    Note that there is not a leading or trailing comma.


    @BeforeEach
    void setUp() {
        stringsJoiner = new StringsJoiner();
        inputStrings = new ArrayList<>();
    }

    @Test
    void shouldJoinIntoEmptyStringWhenListIsEmpty() {
        inputStrings.add("");

        String actual = stringsJoiner.join(inputStrings);

        Assertions.assertEquals("", actual);
    }

    @Test
    void shouldJoinIntoAStringWhenListIsOneString() {
        inputStrings.add("any string");

        String actual = stringsJoiner.join(inputStrings);

        Assertions.assertEquals("any string", actual);
    }

    @Test
    void shouldContainBothStringsWhenListIsTwoStrings() {
        inputStrings.add("A");
        inputStrings.add("B");

        String actual = stringsJoiner.join(inputStrings);

        Assertions.assertTrue(actual.contains("A"));
        Assertions.assertTrue(actual.contains("B"));
    }
}
