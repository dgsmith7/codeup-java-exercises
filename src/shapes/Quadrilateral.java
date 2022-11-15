package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double len;
    protected double wid;

    Quadrilateral() {
    }

    Quadrilateral (double _len, double _wid) {
        this.len = _len;
        this.wid = _wid;
    }

    public double getLength() {
        return this.len;
    }

    public double getWidth() {
        return this.wid;
    }

    abstract void setLength(double _len);
    abstract void setWidth(double _wid);
}
