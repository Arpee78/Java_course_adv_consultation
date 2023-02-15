package w01d2;

import java.util.*;

public class Algorithms {

    //Készíts egy osztályt Algorithms néven, benne egy metódussal, ami egész számok listáját várja.
    // Tudjuk, hogy a listában minden szám egyszer szerepel, kivéve egyet.
    // A feladat az, hogy add vissza azt a számot amelyik többször szerepel!
    public int findDuplicatedNumberS1(List<Integer> numbers){
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i)==numbers.get(i+1)){
                return numbers.get(i);
            }
        }
        return 0;
    }

    public int findDuplicatedNumber(List<Integer> numbers){
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i)==numbers.get(i+1)){
                return numbers.get(i);
            }
        }
        return 0;

    }
}
