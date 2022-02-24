import java.util.Random;
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        Random rand = new Random();
        int tries;
        int correctNum = rand.nextInt(100);

        correctNum += 1;
        while (true) {
            System.out.println("Please enter a number 0-100: "); // Changed from 1-100 because rand.nextInt(100)
            // returns a number between 0 and 99
            int guess1 = scanner.nextInt();

            if(guess1 < correctNum){
                System.out.println("number is too low!");
            }
            else if(guess1 > correctNum){
                System.out.println("Number is too high!");
            }
            else if(guess1 == correctNum){
                System.out.println("You have guessed the number!");
                break; // <---- Add this, this will make the loop stop when the
                //player gets the answer correct and therefore the program will end
            }
        }
//        System.out.print("\nWould you like to play again? (y/n): ");
//        choice = scanner.next();
//        System.out.println();
    }
}





