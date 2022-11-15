package shapes;

public class Square extends Quadrilateral {
    double side;

    Square(double _side) {
        super(_side, _side);
        this.side = _side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    void setLength(double _len) {
        this.side = _len;
    }

    @Override
    void setWidth(double _wid) {
        this.side = _wid;
    }

}
