import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an Integer: ");
            int integerNext = scanner.nextInt(6);
            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "=======" + "  " + "=====");
            System.out.println("Enter an integer: ");
            for (int i = 1; i <= integerNext; i++) {
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);
                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
                System.out.print(message);
            }
            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next();
            System.out.println();

        }
    }
}