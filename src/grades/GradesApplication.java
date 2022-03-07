package grades;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Daemon");
        student1.addGrade(66);
        student1.addGrade(93);
        student1.addGrade(84);

        Student student2 = new Student("Rob");
        student2.addGrade(72);
        student2.addGrade(84);
        student2.addGrade(91);

        Student student3 = new Student("JD");
        student3.addGrade(74);
        student3.addGrade(83);
        student3.addGrade(97);

        Student student4 = new Student("Johan");
        student4.addGrade(92);
        student4.addGrade(96);
        student4.addGrade(100);

        students.put("mailer_daemon", student1);
        students.put("mcLetterKenny", student2);
        students.put("dillinger_for_life", student3);
        students.put("odenheim123", student4);

        System.out.println("Welcome!");

        boolean prompting = true;
        while(prompting) {

            System.out.println("Here are the github usernames of our students:");

            for(String oneStudent : students.keySet()){
                System.out.print(oneStudent + " | ");
            }

            System.out.println("\nWhich student would you like to see more information on?");
            String userResponse = input.getString();
            if (!students.containsKey(userResponse)) {
                System.out.println("Sorry, no student found with the GitHub username of " + userResponse);
                System.out.println("Would you like to see another student? [y/n]");
                if (input.yesNo()) {
                    continue;
                } else{
                    System.out.println("Goodbye, and have a wonderful day!");
                    prompting = false;
                }
            }
            if(students.containsKey(userResponse)){
                System.out.println("\tName:" + students.get(userResponse).getName() + "\n\tGitHub username: " + userResponse + "\n\tCurrent Average: " + students.get(userResponse).getGradeAverage());
                System.out.println("Would you like to see another student? [y/n]");
                if (input.yesNo()) {
                } else{
                    System.out.println("Goodbye!");
                    prompting = false;
                }
            }
        }
    }

}