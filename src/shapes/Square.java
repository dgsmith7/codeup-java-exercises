package shapes;

public class Square extends Rectangle {
    double side;

    Square(double _side) {
        super(_side, _side);
        this.side = _side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return (4 * this.side);
    }

}
