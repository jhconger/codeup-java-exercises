import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;
public class MethodsExercises {
    public static void main(String[] args) {
//        multiply(2, 6);
//        add(3, 3);
//        subtract(12, 6);
//        divide(50, 10);
//        modulus(2, 2);
////        getInteger(1, 10);
//        factor(8);
    }
//
//    public static int add(int x, int y) {
//        System.out.println(x + y);
//        return x + y;
//    }
//
//    public static int subtract(int x, int y) {
//        System.out.println(x - y);
//        return x - y;
//    }
//
////    public static int multiply(int x, int y) {
////        int result = 0;
////        for (int i = 1; i <= y; i++) {
////            result += x;
////        }
////        System.out.println(result);
////        return result;
////    }
//
//    static void multiply(int x, int y) {
//        int result = product(x, y);
//        System.out.println(result);
//    }
//
//    static int product(int x, int y) {
//        // if x is less than
//        // y swap the numbers
//        if (x < y)
//            return product(y, x);
//            // iteratively calculate
//            // y times sum of x
//        else if (y != 0)
//            return (x + product(x, y - 1));
//            // if any of the two numbers is
//            // zero return zero
//        else
//            return 0;
//    }
//
//    public static float divide(int x, int y) {
//        if (y == 0) {
//            System.out.println("Error, cannot divide by zero");
//        }
//        float result = ((float) x) / y;
//        System.out.println(result);
//        return result;
//    }
//
//    public static int modulus(int x, int y) {
//        System.out.println(x % y);
//        return x % y;
//    }
//
//
////    public static int getInteger(int min, int max) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter a number between 1 and 10: ");
////        int userNum = scanner.nextInt();
////        if (userNum < 1) {
////            System.out.println("Your number is too low. Let's go higher.");
////            return getInteger(min, max);
////        } else if (userNum > 10) {
////            System.out.println("Your number is too high. Let's go lower.");
////            return getInteger(min, max);
////        } else {
////            return userNum;
////        }
////    }

//
    static {
        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter a number between 1 and 20: ");
            int num = scanner.nextInt();
            if (num < 1) {
                System.out.println("Your number is too low. Let's go higher.");
            } else if (num > 20) {
                System.out.println("Your number is too high. Let's go lower.");
            } else {
                int i = 0;
                long factorial = 1;

                for (i = 1; i <= num; ++i) {
                    // factorial = factorial * i;
                    factorial *= i;
                }
                System.out.printf("Factorial of %d = %d", num, factorial);
                System.out.print("\nContinue? (y/n): ");
                choice = scanner.next();
                System.out.println();
            }
        }
    }



//
//    Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.


     static  {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean keepRolling = true;
         String choice = "y";
         System.out.println("Enter the number of sides for your pair of dice:");
         int sides = scanner.nextInt();

        do {
            System.out.println("Would you like to roll your dice? (y/n): ");
            if (scanner.next().equalsIgnoreCase("y")) {
//                int n = rand.nextInt(sides * 2);
//                this resulted in rolls of 1 or 0 sometimes which is not possible with di.
                int dice1=(int)(Math.random()*sides+1);
                int dice2=(int)(Math.random()*sides+1);
                int sum= dice1 + dice2;
                System.out.println("You rolled " + sum);
            } else {
                System.out.println("Let's play again sometime.");
                keepRolling = false;
            }
        } while(keepRolling);
                choice = scanner.next();
     }
}











