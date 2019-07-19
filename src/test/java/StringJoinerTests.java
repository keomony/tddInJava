import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringJoinerTests {

//    Join - Joining a list of strings
//    means creating a single new string by
//    concatenating the string in list together with a delimiter between them.
//    For instance, joining the strings {"a", "b”, "c”} on the delimiter ",” would result in the string "a,b,c”.
//    Note that there is not a leading or trailing comma.

    @Test
    void shouldJoinIntoEmptyStringWhenListIsEmpty() {
        StringsJoiner stringsJoiner = new StringsJoiner();
        List<String> emptyString = new ArrayList<>();
        emptyString.add("");

        String actual = stringsJoiner.join(emptyString);

        Assertions.assertEquals("", actual);
    }

    @Test
    void shouldJoinIntoAStringWhenListIsOneString() {
        StringsJoiner stringsJoiner = new StringsJoiner();
        List<String> aString = new ArrayList<>();
        aString.add("any string");

        String actual = stringsJoiner.join(aString);


        Assertions.assertEquals("any string", actual);
    }
}
