package Lesson1;

public class Task1_1_fac_rec {
    public static long getFactorialRec(long number) {
        long result = 0;
        if (number <0) result =-1;
        if (number == 0) {
            result = 1;
        } else if (number == 1) {
            result = 1;
        } else if (number > 1) {
            result = number * getFactorialRec(number - 1);
        }
        return result;
    }
}
