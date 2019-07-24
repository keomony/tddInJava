import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        inputStrings.add("A");
        inputStrings.add("B");

        String actual = stringsJoiner.join(",", inputStrings);

        Assertions.assertTrue(actual.contains("A"));
        Assertions.assertTrue(actual.contains("B"));
    }

    @Test
    void shouldPutDelimiterComaBetweenStrings() {
        inputStrings.add("A");
        inputStrings.add("B");
        inputStrings.add("C");

        String actual = stringsJoiner.join(",", inputStrings);

        Assertions.assertEquals("A,B,C", actual);

    }

    @Test
    void shouldPutDelimiterSemicolonBetweenStrings() {
        inputStrings.add("A");
        inputStrings.add("B");
        inputStrings.add("C");

        String actual = stringsJoiner.join(";", inputStrings);

        Assertions.assertEquals("A;B;C", actual);
    }

    @Test
    void shouldReturnEmptyStringWhenAnyStringIsNull() {
        inputStrings.add("Pick up apples");
        inputStrings.add("Get some bread");
        inputStrings.add(null);

        String actual = stringsJoiner.join(";", inputStrings);

        Assertions.assertEquals("", actual);
    }
}
