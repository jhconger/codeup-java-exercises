
package shapes;

public class Square extends Rectangle {
    public int side;

    public Square(int i, int side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        return (Math.pow(side, 2));
    }

    public int getPerimeter() {
        return (4 * side);
    }
}