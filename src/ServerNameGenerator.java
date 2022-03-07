
import java.util.Scanner;

public class ServerNameGenerator {
    public static String getRandomElement(String[] strings){
        return strings[(int) Math.floor(Math.random() * strings.length)];
    }
    public static void main(String[] args) {

   String[] adjectives = {
                "Adorable",
                "Adventurous",
                "Aggressive",
                "Amused",
                "Åttractive",
                "Average",
                "Awful",
                "Beautiful",
                "Brainy",
                "Blue",
        };

    String[] nouns = {
                "Time",
                "Person",
                "Year",
                "Way",
                "Day",
                "Thing",
                "Man",
                "World",
                "Life",
                "Hand",
        };


        String name;
        do {
            System.out.println("Your server name is: ");
            System.out.println(getRandomElement(adjectives) + "-" + getRandomElement(nouns));
            System.out.println("Enter 'y' if you would like another server name.");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
        } while (name.equals("y"));
    }
}


