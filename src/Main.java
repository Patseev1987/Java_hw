import Lesson5.*;


import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Heap Sort
//        BogdanHeapSort sort = new BogdanHeapSort();
//        int[] myArray = {4,3,7,9,345,3,6,8,0};
//        System.out.println(Arrays.toString(myArray));
//        sort.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
        // Heap sort ArrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 20; i >= 0 ; i--) {
//            list.add(i);
//        }
//        System.out.println(list);
//        HeapSortArrayList heapSort = new HeapSortArrayList();
//        heapSort.sort(list);
//        System.out.println(list);
        //Phonebook
//        Phonebook phonebook = new Phonebook();
//        phonebook.getMenu();
        //NameCounter
        NameCounter nameCounter = new NameCounter();
        nameCounter.showResult();
    }
}