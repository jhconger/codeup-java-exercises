import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);

//        Scanner in = new Scanner(System.in);
//        int integer;
//        System.out.println("Enter an integer");
//        integer = in.nextInt();
//        System.out.println("Here is what you entered: " + integer);
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



            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            System.out.print("What is the length of the classroom?");
            String userWidth = scanner.nextLine();
            int x = Integer.parseInt(userWidth);
            System.out.println(x);

            System.out.print("What is the width of the classroom?");
            String userLength = scanner.nextLine();
            int y = Integer.parseInt(userLength);
            System.out.println(y);


            System.out.println(userWidth);

            int area = (x) * (y);
            System.out.println("Area of the classroom is " + area + " sq.ft");

            int perimeter = 2 * x + 2 * y;
            System.out.println("Perimeter of classroom is " + perimeter + " sq.ft");
            System.out.println("What is the height of the classroom?");
            String userHeight = scanner.nextLine();
            int z = Integer.parseInt(userHeight);
            int volume = y * x * z;
            System.out.println("Volume of the classroom is " + volume + " cu.ft");


//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        System.out.print("What is the length of the classroom?");
//        int userWidth = scanner.nextInt();
//        System.out.println(userWidth);
//
//        System.out.print("What is the width of the classroom?");
//        int userLength = scanner.nextInt();
//        System.out.println(userWidth);
//        int area = userWidth * userLength;
//        System.out.println("Area of the classroom is " + area + " sq.ft");
//
//        int perimeter = 2*userWidth +2*userLength;
//        System.out.println("Perimeter of classroom is " + perimeter + " sq.ft" );
//                System.out.println("What is the height of the classroom?");
//        int userHeight = scanner.nextInt();
//
//        int volume = userLength * userWidth * userHeight;
//        System.out.println("Volume of the classroom is " + volume + " cu.ft");

//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        System.out.print("What is the length of the classroom?");
//        double userWidth = Double.parseDouble(scanner.next());
//        System.out.println(userWidth);
//
//        System.out.print("What is the width of the classroom?");
//        double userLength = Double.parseDouble(scanner.next());
//        System.out.println(userWidth);
//
//        double area = userWidth * userLength;
//        System.out.println("Area of the classroom is " + area + " sq.ft");
//
//        double perimeter = 2*userWidth +2*userLength;
//        System.out.println("Perimeter of classroom is " + perimeter + " sq.ft" );
//        System.out.println("What is the height of the classroom?");
//        double userHeight = Double.parseDouble(scanner.next());
//
//        double volume = userLength * userWidth * userHeight;
//        System.out.println("Volume of the classroom is " + volume + " cu.ft");
// The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):



//        How does this change the way your program operates?

    }




}