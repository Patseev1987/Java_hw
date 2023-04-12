package Lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NameCounter {
    private String separator = File.separator;
    private String path = "src" + separator + "Lesson5" + separator + "Names1.txt";
    private final TreeMap<String, Integer> countToName = new TreeMap<>();
    private ArrayList<String> loadNames() throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = null;
        scanner = new Scanner(file);
        ArrayList<String> nameList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] sepLine = new String[2];
            sepLine = line.split(" ");
            nameList.add(sepLine[0]);
        }
        scanner.close();
        return nameList;
    }
    private void getNameList() throws FileNotFoundException {
        ArrayList<String> names = loadNames();
        for (int i = 0; i < names.size(); i++) {
            int counter = 1;
            if (countToName.containsKey(names.get(i))) {
                counter = countToName.get(names.get(i));
                countToName.put(names.get(i), ++counter);
            } else {
                countToName.put(names.get(i), counter);
            }
        }
    }
    public void showResult() throws FileNotFoundException {
        getNameList();
        System.out.println("This list is not sort!");
        System.out.println(countToName);
        System.out.println("This list is sort!!!");
        sortWithStream();
        sortWithList();
    }
    private void sortWithStream() {
        countToName.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(System.out::println);
    }
    private void sortWithList() {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(countToName.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println(result);
    }

}
