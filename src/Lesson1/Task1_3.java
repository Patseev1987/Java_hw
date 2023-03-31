package Lesson1;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import Lesson2.*;

public class Task1_3 {
   static Scanner sc = new Scanner(System.in);
    private static final Logger LOG = MyLogger.log(Task1_3.class.getName());

    public static void getCalc() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the first number: ");
            int first_number = sc.nextInt();
            LOG.log(Level.INFO,"Entered the fist number.");
            System.out.println("""
                    Enter the mathematical action sign (e.g. "+" , "-", "*", "/"):""");
            String mathematical_action = sc.next().strip();
            LOG.log(Level.INFO,"Entered the mathematical action.");
            System.out.println("Enter the second number: ");
            double second_number = sc.nextInt();
            LOG.log(Level.INFO,"Entered the second number.");
            if (Objects.equals(mathematical_action,"+")) {
                System.out.println("Sum is ---> " + (first_number + second_number));
                LOG.log(Level.INFO,"Got a sum.");
            } else if (Objects.equals(mathematical_action,"-")) {
                System.out.println("Different is ---> " + (first_number - second_number));
                LOG.log(Level.INFO,"Got a different.");
            } else if (Objects.equals(mathematical_action,"*")) {
                System.out.println("Multiplication is ---> " + (first_number * second_number));
                LOG.log(Level.INFO,"Got a multiplication.");
            } else if (Objects.equals(mathematical_action,"/")) {
                if (second_number == 0) {
                    System.out.println("Second number is 0! You can't divide by 0!");
                    LOG.log(Level.INFO,"ERROR! Second number is 0!");
                } else {
                    System.out.println("Division is ---> " + (first_number / second_number));
                    LOG.log(Level.INFO,"Got a division.");
                }
            } else {
                System.out.println("You make mistake when you entered numbers or mathematical action sign.");
                LOG.log(Level.INFO,"You make mistake when you entered numbers or mathematical action sign.");
            }
            System.out.println("If you want to exit enter -1");
            String exit_sing = sc.next().strip();
            if (Objects.equals(exit_sing,"-1")) {
                flag = false;
            }
        }
        LOG.log(Level.INFO,"THE END!!!");
    }
}

