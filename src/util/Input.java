package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no!");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("Y");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number in the range of " + min + " and " + max + ": ");
        int userNum = Integer.parseInt(getString());
        try {
            int parsedNum1 = userNum;
        } catch (NumberFormatException e) {
            System.out.println("That number is not in range. Try again.");
            return getInt(min, max);
        }
        if (userNum < min || userNum > max) {
            System.out.println("Try another number");
            getInt(min, max);
        }
        return userNum;
    }
//    public static int getInt(int min, int max) {
//
//        int userNum = scanner.nextInt();
//        if (userNum < min {
//            System.out.println("Your number is too low. Let's go higher.");
//            return getInteger(min, max);
//        } else if (userNum > max) {
//            System.out.println("Your number is too high. Let's go lower.");
//            return getInteger(min, max);
//        } else {
//            return userNum;
//        }
//    }

    int getInt() {
        System.out.println("Enter a number without limits: ");
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("That isn't an acceptable number. Try again.");
            return getInt();
        }
    }

    double getDouble(double min, double max) {
        System.out.println("Enter a double (number without decimals) in the range of " + min + " and " + max + ": ");
//        double userDouble = scanner.nextDouble();
        double parsedNum = Double.valueOf(getString());
        try {
            if (parsedNum < min || parsedNum > max) {
                System.out.println("Try another number");
                getDouble(min, max);
            }
            return parsedNum;
        } catch (NumberFormatException e) {
            System.out.println("That is not an acceptable number. Try again.");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Enter a double without limits: ");
//        return scanner.nextDouble();
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("That is not an acceptable double. Try again.");
            return getDouble();
        }

    }

    public static void main(String[] args) {
        System.out.println("enter a word: ");
        Input input = new Input();
        System.out.println("You entered: " + input.getString());
        boolean trueOrFalse = input.yesNo();
        System.out.println("Your entry = " + trueOrFalse);
        int yourNumber = input.getInt(-100, 100);
        System.out.println("Your number = " + yourNumber);
        int noLimit = input.getInt();
        System.out.println("You have entered a no limit integer = " + noLimit);
        double userDouble = input.getDouble(-1000.0, 1000.0);
        System.out.println("The double you entered = " + userDouble);
        double noLimitDouble = input.getDouble();
        System.out.println("The no limit double you entered = " + noLimitDouble);
    }

}

