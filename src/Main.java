import Lesson1.*;
import Lesson2.*;
import Lesson3.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

// Min and Max and Arithmetic mean task
        ArrayList<Integer> mainArray = RandomArrayListInteger.getRandomArrayListInteger(25);
        System.out.println(mainArray);
//        System.out.println(MaxAndMinAndArithmeticMean.myMax(mainArray));
//        System.out.println(MaxAndMinAndArithmeticMean.myMix(mainArray));
//        System.out.println(MaxAndMinAndArithmeticMean.myMean(mainArray));

// Delete even in ArrayList task
//        mainArray = EvenDeleter.deleteEven(mainArray);
//        System.out.println(mainArray);

// Different arrays task
//        ArrayList<Integer> mainArray2 = RandomArrayListInteger.getRandomArrayListInteger(10);
//        ArrayList<Integer> mainArray3 = DifferentArrays.getDifferentArrays(mainArray, mainArray2);
//        ArrayList<Integer> mainArray4 = DifferentArrays.getUnionArrays(mainArray, mainArray2);

// Merge Sort Task

mainArray=MyMergeSort.mergeSort(mainArray);
        System.out.println(mainArray);


    }
}