import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        multiply(2, 6);
        add(3, 3);
        subtract(12, 6);
        divide(50, 10);
        modulus(2, 2);

    }

    public static int add(int x, int y) {
        System.out.println(x + y);
        return x + y;
    }

    public static int subtract(int x, int y) {
        System.out.println(x - y);
        return x - y;
    }

//    public static int multiply(int x, int y) {
//        int result = 0;
//        for (int i = 1; i <= y; i++) {
//            result += x;
//        }
//        System.out.println(result);
//        return result;
//    }

    static void multiply(int x, int y) {
        int result = product(x, y);
        System.out.println(result);
    }

    static int product(int x, int y) {
        // if x is less than
        // y swap the numbers
        if (x < y)
            return product(y, x);
            // iteratively calculate
            // y times sum of x
        else if (y != 0)
            return (x + product(x, y - 1));
            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }

    public static float divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error, cannot divide by zero");
        }
        float result = ((float) x) / y;
        System.out.println(result);
        return result;
    }

    public static int modulus(int x, int y) {
        System.out.println(x % y);
        return x % y;
    }


    //    Create a method that validates that user input is in a certain range
//
//        The method signature should look like this:
//

    public static int getInteger(int min, int max) {

        System.out.println("Enter an Integer value ");
        min = 1;
        max = 10;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            getInteger(min, max) = sc.nextInt();
            if (get > 0)
                System.out.println("You entered a positive integer " + userInput);
            else {
                System.out.println("You entered a negative integer " + userInput);
            }
        } else {
            System.out.println("Please Enter Valid Integer");
        }
        return userInput;
    }











