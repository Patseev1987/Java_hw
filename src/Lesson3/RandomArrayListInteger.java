package Lesson3;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Random;

public class RandomArrayListInteger {
    static Random random = new Random();
    public static ArrayList<Integer> getRandomArrayListInteger (int size){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(11));
        }
        return result;
    }
}
