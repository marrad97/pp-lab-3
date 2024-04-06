import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        Circle circle = new Circle(point, 1);
        ColoredCircle coloredCircle = new ColoredCircle(point, 1, "CZERWONY");

        System.out.println(point.toString());

        System.out.println(circle.toString());
        System.out.println(circle.calculatePerimeter());

        System.out.println(coloredCircle.toString());
    }
}