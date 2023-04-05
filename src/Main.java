import Lesson4.*;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = RandomLinkedListInteger.getRandomListListInteger(10);

// Task 1 REVERSE
//        System.out.println(myList);
//        BogdanReverse.getReverseList(myList);
//        System.out.println(myList);
// Task 2 Queue
        BogdanQueue bogdan = new BogdanQueue();
        System.out.println(bogdan);
        bogdan.enqueue(-100);
        System.out.println("After enqueue() "+bogdan);
        int test = bogdan.first();
        System.out.println(test);
        int test2 = bogdan.dequeue();
        System.out.println(test2);
        System.out.println("After dequeue() "+bogdan);
    }
}