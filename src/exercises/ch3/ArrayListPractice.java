package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayListPractice.sumAllEvenValues(numbersToSum);
//        numbersToSum.add(1);
//        numbersToSum.add(2);
//        numbersToSum.add(3);
//        numbersToSum.add(4);
//        numbersToSum.add(5);
//        numbersToSum.add(6);
//        numbersToSum.add(7);
//        numbersToSum.add(8);
//        numbersToSum.add(9);
//        numbersToSum.add(10);


    }

    public static Integer sumAllEvenValues(ArrayList<Integer> valueToSum) {
        for (int i = 0; i < valueToSum.size(); i++) {
            if (valueToSum.get(i) % 2 == 0) {
                Collections.sort(valueToSum);
                System.out.println(valueToSum.get(i));
            }
        }
            return 0;
        }
    }

