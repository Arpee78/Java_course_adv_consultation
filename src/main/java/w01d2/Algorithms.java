package w01d2;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithms {

    //Készíts egy osztályt Algorithms néven, benne egy metódussal, ami egész számok listáját várja.
    // Tudjuk, hogy a listában minden szám egyszer szerepel, kivéve egyet.
    // A feladat az, hogy add vissza azt a számot amelyik többször szerepel!

    public int findDuplicatedNumber_sort(int[] numbers){
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]==numbers[i+1]){
                return numbers[i];
            }
        }
        return numbers.length;
    }

    public int findDuplicate_set(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!set.add(numbers[i])) {
                return numbers[i];
            }
        }
        return numbers.length;
    }

}
