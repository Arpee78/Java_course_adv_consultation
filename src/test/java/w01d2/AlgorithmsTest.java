package w01d2;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void findDuplicatedNumber() {
        Algorithms algorithms = new Algorithms();
        List<Integer> listOfNumbers = new ArrayList<>(List.of(6,2,5,4,3,3,1));
        int result = algorithms.findDuplicatedNumber(listOfNumbers);
        assertEquals(2, result);
    }

}