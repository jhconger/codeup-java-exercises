package shapes;

import util.Input;

public class CircleApp {
        public static void main(String[] args) {
            System.out.println("What is the radius of the circle(using ft?)");
            Input input = new Input();
            double radius = input.getDouble();
            Circle newCircle = new Circle(radius);

            System.out.println("The area of the circle is: " + newCircle.getArea() + " ft.");
            System.out.println("The circumference of the circle is: " + newCircle.getCircumference() + " ft.");
        }
    }

