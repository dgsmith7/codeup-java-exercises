package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(7);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        Measurable myShape = new Rectangle(5,7);
//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());
    }
}
