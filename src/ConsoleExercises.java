import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.4s%n", pi);

        Scanner in = new Scanner(System.in);
        int integer;
        System.out.println("Enter an integer");
        integer = in.nextInt();
        System.out.println("Here is what you entered: " + integer);
//if the input is not an integer it results in an error.

//        Scanner scanner = new Scanner(System.in);
//        String string1;
//        String string2;
//        String string3;
//        System.out.println("Enter three words: ");
//        string1 = scanner.next();
//        string2 = scanner.next();
//        string3 = scanner.next();
//        System.out.println("You entered: --> \"" + string1 + "\" <--");
//        System.out.println("then: --> \"" + string2 + "\" <--");
//        System.out.println("then: --> \"" + string3 + "\" <--");
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

//            Scanner scanner = new Scanner(System.in);
//            scanner.useDelimiter("\n");
//            System.out.println("What is the length of the classroom?");
//            Double width = scanner.nextDouble();
//            System.out.println("What is the width of the classroom?");
//            Double length = scanner.nextDouble();
//            System.out.println("What is the height of the classroom?");
//            Double height = scanner.nextDouble();
//            System.out.println("The area of the room is: " + (width) * (length) + " ft");
//            System.out.println("The perimeter of the room is: " + (width) + 2*(length) + " ft");
//            System.out.println("Volume of the classroom is " + (width) * (length) * (height) + " cu.ft");



    }
}