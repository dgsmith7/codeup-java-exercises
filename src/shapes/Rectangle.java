package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double len;
    protected double wid;

    Rectangle(double _len, double _wid) {
        this.len = _len;
        this.wid = _wid;
    }

    @Override
    public double getPerimeter() {
        return this.len * 2 + this.wid * 2;
    }

    @Override
    public double getArea() {
        return this.len * this.wid;
    }

    @Override
    void setLength(double _len) {
        this.len = _len;
    }

    @Override
    void setWidth(double _wid) {
        this.wid = _wid;
    }

}
