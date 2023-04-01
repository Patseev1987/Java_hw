package Lesson3;
import Lesson2.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyMergeSort {
    private static final Logger LOG = MyLogger.log(BubbleSort.class.getName());

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> myArray) {
        if (myArray.size() <= 1) return myArray;
        ArrayList<Integer> left = new ArrayList<>(myArray.subList(0, (myArray.size() / 2)));

        ArrayList<Integer> right = new ArrayList<>(myArray.subList(left.size(), myArray.size()));
        return merge(mergeSort(left), mergeSort(right));
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        LOG.log(Level.INFO, "Рекурсия!"+"Левый массив "+left.size()+" Правый массив "+right.size());
        int resIn = 0, leftIn = 0, rightIn = 0;
        ArrayList<Integer> result = new ArrayList<>(left);
        result.addAll(right);
        while (leftIn < left.size() && rightIn < right.size()) {
            if (left.get(leftIn) < right.get(rightIn)) {
                result.set(resIn++, left.get(leftIn++));
            } else {
                result.set(resIn++, right.get(rightIn++));
            }
        }
        while (resIn < result.size()) {
            if (leftIn != left.size()) {
                result.set(resIn++, left.get(leftIn++));
            } else {
                result.set(resIn++, right.get(rightIn++));
            }
        }
        return result;
    }
}
