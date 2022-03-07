import java.util.Arrays;
import java.util.Scanner;
public class ArraysExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = newPerson;
        System.out.println();
        return newArray;
    }
    public static void main(String[] args) { //method
//        int[] numbers = {1, 2,3, 4, 5};
//it will not print out until we wrap with Arrays.toString
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("John"); //each element is assigned a new instance of the Person class
        people[1] = new Person("George");
        people[2] = new Person("Paul");
//        System.out.println(Arrays.toString(people));


   for (Person person : people) {
           System.out.println(person.getName());
           }
           System.out.println("Enter a person's name: ");
           Person newPerson = new Person(scanner.nextLine());
           people = addPerson(people, newPerson);
           System.out.println("New list: ");
           for (Person person : people) {
           System.out.println(person.getName());
           }
   }

}

