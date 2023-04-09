package Lesson5;

public class BogdanHeapSort {
    public void sort(int[] array) {
        int size = array.length;
        for (int i = (size / 2) - 1; i >= 0; i--) {
            getMaxHeap(array, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            getMaxHeap(array, i, 0);
        }
    }

    void getMaxHeap(int[] array, int size, int start) {
        int largest = start;
        int left = 2 * start + 1;
        int right = 2 * start + 2;

        if (left < size && array[left] > array[largest]) {
            largest = left;
        }

        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != start) {
            int temp = array[start];
            array[start] = array[largest];
            array[largest] = temp;
            getMaxHeap(array, size, largest);
        }
    }
}
