package sorters;

import fillers.Filler;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * bubble sort down test
 *
 * @see BubbleSortDown
 * @see BubbleSortUpTest
 * @see CollectionSortTest
 * @see MergeSortTest
 * @see QuickSortTest
 * @see SelectionSortTest
 *
 * @author P.Pridorozhny
 */
class BubbleSortDownTest {

    private int[] array;
    private int[] clone;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        array = Filler.randomData(100);
        clone = new int[array.length];
        System.arraycopy(array, 0, clone, 0, array.length);

    }

    @org.junit.jupiter.api.Test
    void testSort() {

        new BubbleSortDown().sort(array);
        Arrays.sort(clone);

        assertArrayEquals(array, clone);

    }

    @org.junit.jupiter.api.Test
    void testIntegrity() {

        new BubbleSortDown().sort(array);

        assertEquals(array.length, clone.length);

    }

    @org.junit.jupiter.api.Test
    void testNull() {

        new BubbleSortDown().sort(null);

    }

}