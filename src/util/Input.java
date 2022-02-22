package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
//        prompt = ("Sup Dawg?");
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("Enter yes or no!");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("Y");
    }

    public int getInt(int min, int max) {
        int userNum;
        do {
            System.out.println("Please enter a number between " + min + " and " + max + "; ");
            userNum = scanner.nextInt();
        } while (userNum > max || userNum < min);
        return userNum;
    }

    public int getInt() {
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userNum;
        do {
            System.out.println("Enter a double (number without decimals) in the range of " + min + " and " + max + ": ");
            userNum = scanner.nextDouble();
        } while (userNum > max || userNum < min);
        return userNum;
    }

    public double getDouble() {
        System.out.println("Enter a double without limits: ");
        double userNum = scanner.nextDouble();
        try {
            return userNum;
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
        double userDouble = input.getDouble(-1000, 1000);
        System.out.println("The double you entered = " + userDouble);
        double noLimitDouble = input.getDouble();
        System.out.println("The no limit double you entered = " + noLimitDouble);
    }

}

