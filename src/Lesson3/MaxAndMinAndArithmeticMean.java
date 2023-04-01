package Lesson3;

import java.util.ArrayList;

public class MaxAndMinAndArithmeticMean {
    public static int myMax(ArrayList<Integer> myArray) {
        int result = myArray.get(0);
        for (int temp : myArray) {
            if (result < temp) result = temp;
        }
        return result;
    }

    public static int myMix(ArrayList<Integer> myArray) {
        int result = myArray.get(0);
        for (int temp : myArray) {
            if (result > temp) result = temp;
        }
        return result;
    }

    public static double myMean(ArrayList<Integer> myArray) {
        double sum = 0;
        for (int temp : myArray) {
            sum += temp;
        }
        double result = sum / myArray.size();
        return result;
    }
}
