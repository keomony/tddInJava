import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringJoinerTests {

    private StringsJoiner stringsJoiner;
    private List<String> inputStrings;

    @BeforeEach
    void setUp() {
        stringsJoiner = new StringsJoiner();
        inputStrings = new ArrayList<>();
    }

    @Test
    void shouldJoinIntoEmptyStringWhenListIsEmpty() {
        inputStrings.add("");

        String actual = stringsJoiner.join(",", inputStrings);

        Assertions.assertEquals("", actual);
    }

    @Test
    void shouldJoinIntoAStringWhenListIsOneString() {
        inputStrings.add("any string");

        String actual = stringsJoiner.join(",", inputStrings);

        Assertions.assertEquals("any string", actual);
    }

    @Test
    void shouldContainBothStringsWhenListIsTwoStrings() {
        String[] strings = {"A", "B"};
        inputStrings.addAll(Arrays.asList(strings));

        String actual = stringsJoiner.join(",", inputStrings);

        Assertions.assertTrue(actual.contains("A"));
        Assertions.assertTrue(actual.contains("B"));
    }

    @Test
    void shouldPutDelimiterComaBetweenStrings() {
        String[] strings = {"A", "B", "C"};
        inputStrings.addAll(Arrays.asList(strings));

        String actual = stringsJoiner.join(",", inputStrings);

        Assertions.assertEquals("A,B,C", actual);
    }

    @Test
    void shouldPutDelimiterSemicolonBetweenStrings() {
        String[] strings = {"A", "B", "C"};
        inputStrings.addAll(Arrays.asList(strings));

        String actual = stringsJoiner.join(";", inputStrings);

        Assertions.assertEquals("A;B;C", actual);
    }

    @Test
    void shouldReturnEmptyStringWhenAnyStringIsNull() {
        String[] strings = {"Pick up apples", "Get some bread", null};
        inputStrings.addAll(Arrays.asList(strings));


        String actual = stringsJoiner.join(";", inputStrings);

        Assertions.assertEquals("", actual);
    }

    @Test
    void shouldReturnSpaceInBetweenStringsWhenDelimiterIsEmpty() {
        String[] strings = {"A", "B", "C"};
        inputStrings.addAll(Arrays.asList(strings));

        String actual = stringsJoiner.join("", inputStrings);

        Assertions.assertEquals("A B C", actual);
     }
}
