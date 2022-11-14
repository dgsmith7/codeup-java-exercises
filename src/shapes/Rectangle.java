package shapes;

public class Rectangle {
    protected double len;
    protected double wid;

    Rectangle() {

    }

    Rectangle(double _len, double _wid) {
        this.len = _len;
        this.wid = _wid;
    }

    public double getArea() {
        return this.len * this.wid;
    }

    public double getPerimeter() {
        return (2 * this.len) + (2 * this.wid);
    }
}
