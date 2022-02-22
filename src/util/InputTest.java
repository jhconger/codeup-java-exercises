package util;

import static java.lang.System.*;

public class InputTest {
    public static void main(String[] args) {
        out.println("enter a word: ");
        Input input = new Input();
        out.println("You entered: " + input.getString());
        boolean trueOrFalse = input.yesNo();
        out.println("Your entry = " + trueOrFalse);
        int yourNumber = input.getInt(-100, 100);
        out.println("Your number = " + yourNumber);
        int noLimit = input.getInt();
        out.println("You have entered a no limit integer = " + noLimit);
        double userDouble = input.getDouble(-1000, 1000);
        out.println("The double you entered = " + userDouble);
        double noLimitDouble = input.getDouble();
        out.println("The no limit double you entered = " + noLimitDouble);
    }
}