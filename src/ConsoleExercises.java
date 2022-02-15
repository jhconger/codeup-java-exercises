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

        Scanner scanner = new Scanner(System.in);
        String string1;
        String string2;
        String string3;
        System.out.println("Enter three words: ");
        string1 = scanner.next();
        string2 = scanner.next();
        string3 = scanner.next();
        System.out.println("You entered: --> \"" + string1 + "\" <--");
        System.out.println("then: --> \"" + string2 + "\" <--");
        System.out.println("then: --> \"" + string3 + "\" <--");
// Entering less than three words results in the function not running.  Entering more than three words only returns the first three words.
        Scanner string = new Scanner(System.in);
        String string4;
        System.out.println("Enter a sentence: ");
//        string4 = string.next();
//        this returns the first word of the sentence.
        string4 = string.nextLine();
        System.out.println("You entered: --> \"" + string4 + "\" <--");
    }
}
