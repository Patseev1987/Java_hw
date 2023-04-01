package Lesson3;

import java.util.ArrayList;

public class DifferentArrays {
    public static ArrayList<Integer> getDifferentArrays(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Fist array ---> " + firstArray);
        firstArray = DifferentArrays.deleteClone(firstArray);
        System.out.println("Second array ---> " + secondArray);
        secondArray = DifferentArrays.deleteClone(secondArray);
        for (int temp : firstArray) {
            if (secondArray.contains(temp)) {
            } else {
                result.add(temp);
            }
        }
        System.out.println("We have different first array and second array:");
        System.out.println(result);
        return result;
    }

    public static ArrayList<Integer> getUnionArrays(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Fist array ---> " + firstArray);
        firstArray = DifferentArrays.deleteClone(firstArray);
        System.out.println("Second array ---> " + secondArray);
        secondArray = DifferentArrays.deleteClone(secondArray);
        for (int temp : firstArray) {
            if (secondArray.contains(temp)) {
                result.add(temp);
            }
        }
        System.out.println("We have union first array and second array:");
        System.out.println(result);
        return result;
    }

    public static ArrayList<Integer> deleteClone(ArrayList<Integer> myArray) {
        for (int i = 0; i < myArray.size(); i++) {
            int firstIndex = myArray.indexOf(myArray.get(i));
            int lastIndex = myArray.lastIndexOf(myArray.get(i));
            if (firstIndex != lastIndex) {
                myArray.remove(lastIndex);
                i--;
            }
        }
        System.out.println("Array without repeating elements " + myArray);
        return myArray;
    }
}

