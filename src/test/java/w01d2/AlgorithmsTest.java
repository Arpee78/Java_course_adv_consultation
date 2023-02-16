package w01d2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void findDuplicatedNumber_sort() {
        Algorithms algorithms = new Algorithms();
        int[] numbers = {10, 2, 5, 4, 3, 1, 1};
        int result = algorithms.findDuplicatedNumber_sort(numbers);
        assertEquals(1, result);
    }

    @Test
    void findDuplicatedNumber_set() {
        Algorithms algorithms = new Algorithms();
        int[] numbers = {10, 2, 5, 4, 3, 1, 1};
        int result = algorithms.findDuplicate_set(numbers);
        assertEquals(1, result);
    }

}