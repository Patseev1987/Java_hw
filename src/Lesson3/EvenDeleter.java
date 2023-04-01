package Lesson3;

import java.util.ArrayList;

public class EvenDeleter {
    public static ArrayList<Integer> deleteEven(ArrayList<Integer> myArray){
            for (int j = 0; j < myArray.size(); j++) {
            if (myArray.get(j)%2==0){
                myArray.remove(j);
                j--;
            }
        }
        return myArray;
    }
}
