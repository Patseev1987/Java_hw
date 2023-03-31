package Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort {
    private static final Logger LOG = MyLogger.log(BubbleSort.class.getName());

    public static String getBubbleSort(int[] someArray) {
        int count=0;
        int temp = someArray[0];
        for (int i = 0; i < someArray.length - 1; i++) {
            LOG.log(Level.INFO, "Big iteration "+(i+1));
            for (int j = 0; j < someArray.length - 1 - i; j++) {
                LOG.log(Level.INFO, "Small iteration "+(++count));
                if (someArray[j + 1] < someArray[j]) {
                    temp = someArray[j];
                    someArray[j] = someArray[j + 1];
                    someArray[j + 1] = temp;
                    LOG.log(Level.INFO, "Bingo!");
                }
            }
        }
        System.out.println(Arrays.toString(someArray));
        String result = Arrays.toString(someArray);
        BubbleSort.writeMyFile(result);
        return result;
    }

    public static void writeMyFile(String arg) {
        try (FileWriter in = new FileWriter("BubbleSortArray.txt");) {
            in.append(arg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
