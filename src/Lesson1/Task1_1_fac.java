package Lesson1;

public class Task1_1_fac {
    public static long getFactoril(long number) {
        long result =0;
        if (number < 0) {
            result = -1;
        } else if (number >= 1) {
             result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } else {
            result = 1;
        }
        return result;
    }
}

