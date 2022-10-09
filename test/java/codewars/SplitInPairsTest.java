package codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitInPairsTest {

    @Test
    public void testSplitEmpty() {
        assertArrayEquals(new String[]{}, SplitInPairs.splitInPairs(""));
    }

    @Test
    public void testSplitInPairs() {
        assertAll(
                () -> assertArrayEquals(new String[]{"AB", "CD", "EF"},
                        SplitInPairs.splitInPairs("ABCDEF")),

                () -> assertArrayEquals(new String[]{"ab", "c_"},
                        SplitInPairs.splitInPairs("abc"))

        );
    }
}
