import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
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


    }
}
