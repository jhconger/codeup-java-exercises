package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return ((2 * this.length) + (2 * this.width));    }

    public double getArea() {
        return this.width * this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
//
}