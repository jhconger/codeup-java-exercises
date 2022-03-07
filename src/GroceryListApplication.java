import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApplication {
    static HashMap<String, Integer> map = new HashMap<>();

    public static void addItem(HashMap<String, Integer> category, String item, int amount) {
        category.put(item, amount);
    }
    public static void getItems(HashMap<String, Integer> category) {
        TreeMap<String, Integer> sortItems = new TreeMap<>(category);
        for (Map.Entry<String, Integer> item: sortItems.entrySet()){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        Input input = new Input();

        ArrayList<String> category = new ArrayList<>();
        category.add("1. Beverages");
        category.add("2. Bread / Bakery");
        category.add("3. Produce");
        category.add("4. Dairy");
        category.add("5. Meat");
        category.add("6. Frozen Foods");
        category.add("7. Personal Care");
        category.add("8. Household");

        HashMap<String, Integer> Beverages = new HashMap<>();
        HashMap<String, Integer> Bakery = new HashMap<>();
        HashMap<String, Integer> Produce = new HashMap<>();
        HashMap<String, Integer> Dairy = new HashMap<>();
        HashMap<String, Integer> Meat = new HashMap<>();
        HashMap<String, Integer> Frozen = new HashMap<>();
        HashMap<String, Integer> Personal = new HashMap<>();
        HashMap<String, Integer> Household = new HashMap<>();

        System.out.print("Would you like to create a grocery list? [Y/N] ");
        boolean userInput = input.yesNo();
        input.getString();

        if (userInput) {
            boolean confirm;
            do {
                boolean addMoreGroceries;
                do {
                    System.out.println("""
                            Choose a category to add groceries to:\s
                            1. Beverages
                            2. Bakery
                            3. Produce
                            4. Dairy
                            5. Meat
                            6. Frozen Foods
                            7. Personal Care
                            8. Household
                            """);

                    int userChoice = input.getInt();
                    input.getString();

                    System.out.print("Enter the name of the item: ");
                    String userItemName = input.getString();
                    System.out.print("Enter the amount of the item you want: ");
                    int userItemAmount = input.getInt();

                    // switch case for user choice
                    switch (userChoice) {
                        case 1 -> addItem(Beverages, userItemName, userItemAmount);
                        case 2 -> addItem(Bakery, userItemName, userItemAmount);
                        case 3 -> addItem(Produce, userItemName, userItemAmount);
                        case 4 -> addItem(Dairy, userItemName, userItemAmount);
                        case 5 -> addItem(Meat, userItemName, userItemAmount);
                        case 6 -> addItem(Frozen, userItemName, userItemAmount);
                        case 7 -> addItem(Personal, userItemName, userItemAmount);
                        case 8 -> addItem(Household, userItemName, userItemAmount);
                        default -> System.out.println("Not a valid choice.");
                    }

                    input.getString();

                    System.out.print("Do you want to add more groceries? [Y/N] ");
                    String userAddMore = input.getString();
                    addMoreGroceries = userAddMore.equalsIgnoreCase("y");
                } while (addMoreGroceries);

                System.out.print("Do you want to continue? [Y/N] ");
                String userCont = input.getString();
                confirm = userCont.equalsIgnoreCase("y");
            } while (confirm);
        }


        System.out.println("Here is a summary of all of your list items: ");

        getItems(Beverages);
        getItems(Bakery);
        getItems(Produce);
        getItems(Dairy);
        getItems(Meat);
        getItems(Frozen);
        getItems(Personal);
        getItems(Household);
    }

}



