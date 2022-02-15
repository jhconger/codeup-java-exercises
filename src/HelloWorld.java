public class HelloWorld {
//    renaming this class will result in an error because the file name and class must be the same.
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);
        String myString = "Oh my, oh my, what a string";
//        String myString = 3.14159;
//        String myString = 'c'
        System.out.println(myString);
//        long myNumber;
//        long myNumber = 3.14;
//        long myNumber = 123L;
//        long myNumber = 123;
//        3.14 does not compile because of the decimal point, which creates a much smaller number.
//        float myNumber = 3.14;
//        double myNumber = 3.14;
///*        float myNumber = (float) 3.14;
//        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(x);*/
//         this code block will print out 5 and increment only one time after that to 6.
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        System.out.println(x);
//        this code block increments before it prints out x and not again.
//       int class = 5;
//        this will not work because class is reserved in the naming convention for methods.
        String theNumberThree = "three";
        Object o = theNumberThree;
/*
        int three = (int) o;
        I expect this to print out the string "three"
        System.out.println(o);
        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        at HelloWorld.main(HelloWorld.java:34)
        int three = (int) "three";
        this isn't much different as the string "three" was already being assigned to Object o.  Both blocks of code attempt to cast a String to an Integer.
        int x = 4;
       x += 5;
       System.out.println(x);
        int x = 3;
        int y = 4;
        y *= x;
        System.out.println(y);
*/
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
//        Trying to initialize a variable N with value Integer.MAX_VALUE + 1 results in N = -2147483648
//        Trying to initialize a variable N with value Integer.MIN_VALUE - 1 results in N = 2147483647
// java will wrap an over incremented or decremented value to the negative/opposite sign value i.e.
// int x = 2147483647;
// x++;
// Java run-time will "wrap" the result to the Integer.MIN_VALUE of -2147483648.

    }
}