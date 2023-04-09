package Lesson5;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Lesson2.BubbleSort;
import Lesson2.MyLogger;


public class HeapSortArrayList {
    private static final Logger LOG = MyLogger.log(BubbleSort.class.getName());

    public void sort(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = (size / 2) - 1; i >= 0; i--) {
            getMaxHeap(list, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);
            LOG.log(Level.INFO, "Largest will been cut --->  " + list.get(i));
            getMaxHeap(list, i, 0);
        }
    }

    public void getMaxHeap(ArrayList<Integer> list, int size, int start) {
        int largest = start;
        int left = 2 * start + 1;
        int right = 2 * start + 2;

        if (left < size && list.get(left) > list.get(largest)) {
            largest = left;
        }
        if (right < size && list.get(right) > list.get(largest)) {
            largest = right;
        }
        if (largest != start) {
            int temp = list.get(start);
            list.set(start, list.get(largest));
            list.set(largest, temp);
            getMaxHeap(list, size, largest);
        }
    }
}

