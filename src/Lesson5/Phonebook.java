package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    Scanner sc = new Scanner(System.in);
    private final Map<String, ArrayList<String>> nameToPhonebook = new HashMap<>();
    private String addContactName() {
        System.out.println("Enter contact name:");
        String contactName = sc.nextLine();
        contactName = contactName.toUpperCase().strip();
        return contactName;
    }
    private String addPhoneNumber(String name) {
        System.out.println("Enter phone number for " + name + ":");
        String phoneNumber = sc.nextLine();
        phoneNumber = phoneNumber.strip();
        return phoneNumber;
    }
    private void addContact() {
        String name = addContactName();
        boolean flag = true;
        String number;
        ArrayList<String> phoneNumbers = new ArrayList<>();
        while (flag) {
            number = addPhoneNumber(name);
            phoneNumbers.add(number);
            System.out.println("If you want to add another number press 1 or press any key for exit");
            String choice = sc.nextLine().strip();
            if (!choice.equals("1")) {
                flag = false;
            }
        }
        nameToPhonebook.put(name, phoneNumbers);
    }
    private void showContacts() {

        int count = 1;
        for (Map.Entry<String, ArrayList<String>> entry : nameToPhonebook.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append((count++) + ". ");
            sb.append(entry.getKey() + " ");
            sb.append(entry.getValue());
            System.out.println(sb.toString());
        }
    }
    private void showOneContact() {
        System.out.println("Enter a name or surname for search:");
        String nameForSearch = sc.nextLine().strip().toUpperCase();
        for (Map.Entry<String, ArrayList<String>> entry : nameToPhonebook.entrySet()) {
            if (entry.getKey().contains(nameForSearch)) {
                System.out.println(entry);
            }
        }
    }
    public void getMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    1. Add contact
                    2. Show all contact
                    3. Show contact (you should enter the name)
                    4. Exit
                    """);
            String choice = sc.nextLine().strip();
            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    showContacts();
                    break;
                case "3":
                    showOneContact();
                    break;
                case "4":
                    flag = false;
            }
        }
    }

}
