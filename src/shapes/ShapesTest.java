package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Rectangle(2,7);
        Measurable myShape2 = new Square(5,10);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape2.getArea() = " + myShape2.getArea());
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());


    }


}