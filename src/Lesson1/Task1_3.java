package Lesson1;

import java.util.Objects;
import java.util.Scanner;

public class Task1_3 {
   static Scanner sc = new Scanner(System.in);

    public static void getCalc() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the first number: ");
            int first_number = sc.nextInt();
            System.out.println("""
                    Enter the mathematical action sign (e.g. "+" , "-", "*", "/"):""");
            String mathematical_action = sc.next().strip();
            System.out.println("Enter the second number: ");
            double second_number = sc.nextInt();
            if (Objects.equals(mathematical_action,"+")) {
                System.out.println("Sum is ---> " + (first_number + second_number));
            } else if (Objects.equals(mathematical_action,"-")) {
                System.out.println("Different is ---> " + (first_number - second_number));
            } else if (Objects.equals(mathematical_action,"*")) {
                System.out.println("Multiplication is ---> " + (first_number * second_number));
            } else if (Objects.equals(mathematical_action,"/")) {
                if (second_number == 0) {
                    System.out.println("Second number is 0! You can't divide by 0!");
                } else {
                    System.out.println("Division is ---> " + (first_number / second_number));
                }
            } else {
                System.out.println("You make mistake when you entered numbers or mathematical action sign.");
            }
            System.out.println("If you want to exit enter -1");
            String exit_sing = sc.next().strip();
            if (Objects.equals(exit_sing,"-1")) {
                flag = false;
            }
        }
    }
}

