package Lesson4;

import java.util.LinkedList;
import java.util.Random;

public class RandomLinkedListInteger {
    static Random random = new Random();
    public static LinkedList<Integer> getRandomListListInteger(int size){
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(11));
        }
        return result;
    }
}
