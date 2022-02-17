import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//
//        Scanner darkly = new Scanner(System.in);
//        int integer;
//        System.out.println("Enter an integer");
//        integer = darkly.nextInt();
//        System.out.println("Here is what you entered: " + integer);
//if the input is not an integer it results in an error.

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
        System.out.print("Enter three words: ");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        System.out.print("You entered: --> \"" + string1 + "\" <--");
        System.out.print("then: --> \"" + string2 + "\" <--");
        System.out.print("then: --> \"" + string3 + "\" <--");
//// Entering less than three words results in the function not running.  Entering more than three words only returns the first three words.

//        Scanner string = new Scanner(System.in);
//        String string4;
//        System.out.println("Enter a sentence: ");
////        string4 = string.next();
////        this returns the first word of the sentence.
//        string4 = string.nextLine();
//        System.out.println("You entered: --> \"" + string4 + "\" <--");

//            Scanner scanner = new Scanner(System.in);
//            System.out.println("What is the length of the classroom?");
//            String width = scanner.next();
//            System.out.println("What is the width of the classroom?");
//            String length = scanner.next();
//            System.out.println("The area of the room is: " + Integer.parseInt(width) * Integer.parseInt(length) + " ft");
//            System.out.println("The perimeter of the room is: " + 2*Integer.parseInt(width)+ 2*Integer.parseInt(length) + " ft");
//
            Scanner scan = new Scanner(System.in);
//            scan.useDelimiter("\n");
            System.out.print("What is the length of the classroom?");
            Double wide = scan.nextDouble();
            System.out.print("What is the width of the classroom?");
            Double longth = scan.nextDouble();
            System.out.print("What is the height of the classroom?");
            Double height = scan.nextDouble();
            System.out.print("The area of the room is: " + (wide) * (longth) + " ft");
            System.out.print("The perimeter of the room is: " + (wide) + 2*(longth) + " ft");
            System.out.print("Volume of the classroom is " + (wide) * (longth) * (height) + " cu.ft");



    }
}