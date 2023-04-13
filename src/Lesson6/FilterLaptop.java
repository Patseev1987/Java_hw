package Lesson6;

import java.util.*;

public class FilterLaptop {
    private final Set<Laptop> laptops = new HashSet<>();
    private final Map<Integer, Laptop> listLaptops = new HashMap<>();
    private Set<Laptop> filteredLaptops = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public FilterLaptop() {
        fillLaptopsSet();
        fillMapWithLaptops();
    }

    private void fillLaptopsSet() {
        Laptop laptopDell = new Laptop("Dell", 15, "AMD", "Red");
        laptops.add(laptopDell);
        Laptop laptopDell2 = new Laptop("Dell", 15, "AMD", "Red");
        laptops.add(laptopDell2);
        Laptop laptopMsi = new Laptop("MSI", 17, "INTEL", "Black");
        laptops.add(laptopMsi);
        Laptop laptopHp = new Laptop("HP", 15, "INTEL", "Silver");
        laptops.add(laptopHp);
        Laptop laptopMac = new Laptop("Mac", 14, "M2", "Silver");
        laptops.add(laptopMac);
        System.out.println("We have those laptops:");
        System.out.println(laptops);
    }

    private void fillMapWithLaptops() {
        int count = 1;
        for (Laptop laptop : laptops) {
            listLaptops.put(count++, laptop);
        }
    }

    public void filter() {
        boolean flag = true;
        while (flag) {
            filteredLaptops.clear();
            System.out.println("""
                    You can filter list laptops:
                    1 ---> Brand
                    2 ---> Screen size
                    3 ---> Processor
                    4 ---> Color
                    5 ---> Exit
                    """);
            String choice = getChoice();
            switch (choice) {
                case "1": // Brand
                    getFilterBrand();
                    break;
                case "2": // Screen size
                      getFilterScreenSize();
                    break;
                case "3": // Processor
                      getFilterProcessor();
                    break;
                case "4": // Color
                     getFilterColor();
                    break;
                case "5":
                    flag = false;
                    break;
            }
        }


    }

    private String getChoice() {
        while (true) {
            System.out.println("Enter your choice:");
            String choice = sc.next().strip();
            boolean condition = choice.equals("1") || choice.equals("2") ||
                    choice.equals("3") || choice.equals("4") || choice.equals("5");
            if (condition) {
                return choice;
            } else {
                System.out.println("You entered wrong number. Please try again.");
            }
        }
    }

    private void getFilterBrand() {
        System.out.println("Please enter brand:");
        String brandFilter = sc.next().toLowerCase().strip();
        for (Map.Entry<Integer, Laptop> temp : listLaptops.entrySet()) {
            if (brandFilter.equals(temp.getValue().getBrand())) {
                filteredLaptops.add(temp.getValue());
            }
        }
        if (!filteredLaptops.isEmpty()) {
            System.out.println(filteredLaptops);
        }else{
            System.out.println("Laptops isn't found");
        }
        sc.nextLine();
        System.out.println("Press some key for continue");
        sc.nextLine();
    }

    private void getFilterColor() {
        System.out.println("Please enter color:");
        String colorFilter = sc.next().toLowerCase().strip();
        for (Map.Entry<Integer, Laptop> temp : listLaptops.entrySet()) {
            if (colorFilter.equals(temp.getValue().getColor())) {
                filteredLaptops.add(temp.getValue());
            }
        }
        if (!filteredLaptops.isEmpty()) {
            System.out.println(filteredLaptops);
        }else{
            System.out.println("Laptops isn't found");
        }
        sc.nextLine();
        System.out.println("Press some key for continue");
        sc.nextLine();
    }

    private void getFilterProcessor() {
        System.out.println("Please enter processor:");
        String processorFilter = sc.next().toLowerCase().strip();
        for (Map.Entry<Integer, Laptop> temp : listLaptops.entrySet()) {
            if (processorFilter.equals(temp.getValue().getProcessor())) {
                filteredLaptops.add(temp.getValue());
            }
        }
        if (!filteredLaptops.isEmpty()) {
            System.out.println(filteredLaptops);
        }else{
            System.out.println("Laptops isn't found");
        }
        sc.nextLine();
        System.out.println("Press some key for continue");
        sc.nextLine();
    }

    private void getFilterScreenSize() {
        boolean flag = true;
        int screenSizeFilter = 0;
        while (flag) {
            try {
                System.out.println("Please enter screen size:");
                String number = sc.next();
                screenSizeFilter=Integer.parseInt(number);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("You entered wrong symbol. Try again");
            }
        }
        for (Map.Entry<Integer, Laptop> temp : listLaptops.entrySet()) {
            if (screenSizeFilter==temp.getValue().getScreenSize()) {
                filteredLaptops.add(temp.getValue());
            }
        }
        if (!filteredLaptops.isEmpty()) {
            System.out.println(filteredLaptops);
        }else{
            System.out.println("Laptops isn't found");
        }
        sc.nextLine();
        System.out.println("Press some key for continue");
        sc.nextLine();
    }
}
