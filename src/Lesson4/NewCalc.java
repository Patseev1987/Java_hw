package Lesson4;

import Lesson2.MyLogger;
import org.w3c.dom.html.HTMLIsIndexElement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class NewCalc {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Double> history = new ArrayList<>();
    private String choice;
    private static final Logger LOG = MyLogger.log(NewCalc.class.getName());
    private int lastIndex;
    private double last;

    public void getAction(double myFirstNumber, String myMathAction, double mySecondNumber) {
        double result;
        if (myMathAction.equals("+")) {
            result = myFirstNumber + mySecondNumber;
            System.out.println("Sum is ---> " + result);
            history.add(result);
        } else if (myMathAction.equals("-")) {
            result = myFirstNumber - mySecondNumber;
            System.out.println("Different is ---> " + result);
            history.add(result);
            System.out.println(history);
        } else if (myMathAction.equals("*")) {
            result = myFirstNumber * mySecondNumber;
            System.out.println("Multiplication is ---> " + result);
            history.add(result);
        } else if (myMathAction.equals("/")) {
            if (mySecondNumber == 0) {
                System.out.println("Second number is 0! You can't divide by 0!");
            } else {
                result = myFirstNumber / mySecondNumber;
                System.out.println("Division is ---> " + result);
                history.add(result);
            }
        }
    }

    private double getFirstNumber() {
        while (true) {
            System.out.println("Enter the next number: ");
            try {
                double firstNumber = sc.nextDouble();
                return firstNumber;
            } catch (NumberFormatException e) {
                System.out.println("You entered wrong first symbol. Try again!");
            }
        }
    }

    private double getNextNumber() {
        while (true) {
            System.out.println("Enter the next number: ");
            try {
                double nextNumber = sc.nextDouble();
                return nextNumber;
            } catch (NumberFormatException e) {
                System.out.println("You entered wrong symbol. Try again!");
            }
        }
    }

    private String chooseActionInMenu() {
        while (true) {
            System.out.println("""
                    "What do you want to do?"
                    1. Continue           ---> Press "1"
                    2. Cancel last action ---> Press "2"
                    3. Reset              ---> Press "3"
                    4. Exit               ---> Press "4"
                            """);
            String result = sc.next();
            result = result.strip();
            boolean consider = result.equals("1") || result.equals("2")
                    || result.equals("3") || result.equals("4");

            if (consider) {
                return result;
            } else {
                System.out.println("You entered wrong number! Try Again");
            }
        }
    }

    private String getMathAction() {
        while (true) {
            System.out.println("""
                    Enter the mathematical action sign (e.g. "+" , "-", "*", "/", "="):""");
            String mathematical_action = sc.next().strip();
            boolean condition = (mathematical_action.equals("+") || mathematical_action.equals("-")
                    || mathematical_action.equals("*") || mathematical_action.equals("/")
                    || mathematical_action.equals("="));
            if (condition) {
                return mathematical_action;
            } else {
                System.out.println("You entered wrong sing! Try again");
            }
        }
    }

    public void run() {
        history.add(0.0);
        lastIndex = history.size() - 1;
        last = history.get(lastIndex);
        double fistNumber = getFirstNumber();
        String mathAction = getMathAction();
        double nextNumber = getNextNumber();
        getAction(fistNumber, mathAction, nextNumber);
        boolean flag = true;
        while (flag) {
            lastIndex = history.size() - 1;
            last = history.get(lastIndex);
            System.out.println(last);
            mathAction = getMathAction();
            if (mathAction.equals("=")) {
                System.out.println(last);
                choice = chooseActionInMenu();
                if (choice.equals("1")) {
                } else if (choice.equals("2")) {
                    if (history.size()>1) {
                        history.remove(last);
                    }else{
                        System.out.println("History is clear!");
                    }
                } else if (choice.equals("3")) {
                    history.clear();
                    history.add(0.0);
                } else if (choice.equals("4")) {
                    flag = false;
                }
            } else {
                nextNumber = getNextNumber();
                getAction(last, mathAction, nextNumber);
            }
        }
    }
}

