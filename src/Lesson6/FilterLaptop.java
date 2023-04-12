package Lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FilterLaptop {
    private final Set<Laptop> laptops = new HashSet<>();
    private final Map <Integer,Laptop> listLaptops= new HashMap<>();

    public void fillLaptopsSet(){
        Laptop laptopDell = new Laptop("Dell",15,"AMD","Red" );
        laptops.add(laptopDell);
        Laptop laptopDell2 = new Laptop("Dell",15,"AMD","Red" );
        laptops.add(laptopDell2);
        Laptop laptopMsi = new Laptop("MSI",17,"INTEL","Black");
        laptops.add(laptopMsi);
        Laptop laptopHp = new Laptop("HP",15,"INTEL","Silver");
        laptops.add(laptopHp);
        Laptop laptopMac = new Laptop("Mac",14,"M2","Silver");
        laptops.add(laptopMac);
        System.out.println("You have those laptops:");
        System.out.println(laptops);
    }

    public void fillMapWithLaptops(){
        int count =1;
        for (Laptop laptop: laptops) {
            listLaptops.put(count++,laptop);
        }
        System.out.println(listLaptops);
    }


}
