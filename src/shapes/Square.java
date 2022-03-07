package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double width) {
        this.length = width;
    }
}