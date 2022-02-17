import java.util.Scanner;
import java.util.*;
import static java.lang.System.out;
import java.io.BufferedReader;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i++ + " ");
//
//        }
//

//        int count = 0;
//        do {
//            System.out.println(count);
//            count = count + 2;
//        } while(count <= 100);
//    }
//

//        int count = 100;
//        do {
//            System.out.println(count);
//            count = count -5;
//        } while(count >= -10);
//    }


//        long count = 2;
//        do {
//            System.out.println(count);
//            count *= count;
//        } while (count < 1000000);
//

//        for(int i = 5; i <=15; ) {
//            System.out.print(i++ + " ");
//        }
//    }


//        for (int i = 0; i < 100; ) {
//            System.out.println(i = i + 2);
//        }
//    }


//        for (int i = 100; i > -10; ) {
//            System.out.println(i = i - 5);
//        }
//    }


//        for (long i = 2; i <= 10000; ) {
//            System.out.println(i *= i);
//        }
//    }


//    for (int i = 1; i <= 100; i++) {
//        if (i%15 == 0)
//            System.out.println("FizzBuzz");
//        else if (i%3 == 0)
//            System.out.println("Fizz");
//        else if (i%5 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(i);
//        }
//    }
//        Scanner scanner = new Scanner(System.in);
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.println("Enter an Integer: ");
//            int integerNext = scanner.nextInt(6);
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "=======" + "  " + "=====");
//            System.out.println("Enter an integer: ");
//            for (int i = 1; i <= integerNext; i++) {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//                System.out.print(message);
//            }
//            System.out.print("\nContinue? (y/n): ");
//            choice = scanner.next();
//            System.out.println();
//
//        }
//    }
        Scanner grades = new Scanner(System.in);
        int x = 0;
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Entre a numeric grade between 0 and 100: ");
            x = grades.nextInt();
            if (x >= 0 && x <= 100)
                if (x <= 100 && x >= 96) {
                    System.out.println("A+");
                } else if (x <= 95 && x >= 92) {
                    System.out.println("A");
                } else if (x <= 91 && x >= 90) {
                    System.out.println("A-");
                } else if (x <= 89 && x >= 86) {
                    System.out.println("B+");
                } else if (x <= 85 && x >= 80) {
                    System.out.println("B");
                } else if (x <= 79 && x >= 76) {
                    System.out.println("C+");
                } else if (x <= 75 && x >= 70) {
                    System.out.println("C");
                } else if (x <= 69 && x >= 66) {
                    System.out.println("D+");
                } else if (x <= 65 && x >= 60) {
                    System.out.println("D");
                } else if (x <= 59 && x >= 0) {
                    System.out.println("F");
                }
            System.out.print("\nContinue? (y/n): ");
            choice = grades.next();
            System.out.println();
            }
        }
    }