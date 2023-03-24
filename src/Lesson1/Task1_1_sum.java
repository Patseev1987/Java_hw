package Lesson1;

public class Task1_1_sum {
    public static int getSum(int number){
        int result = 0;
        if (number<0){
            result =-1;
        } else{
            for (int i = 0; i <= number ; i++) {
                result+=i;
            }
        }

        return result;
    }
}
