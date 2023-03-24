package Lesson1;

public class Task1_1_sum_rec {
    public static int getSumRec(int number) {
        int result = 0;
        if (number <= 0) {
            result = -1;
        } else if (number == 1) {
            result = 1;
        } else if (number > 1) {
            result = number + getSumRec(number - 1);
        }
        return result;
    }
}