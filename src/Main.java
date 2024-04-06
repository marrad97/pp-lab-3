import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        Circle circle = new Circle(point, 1);

        System.out.println(point.toString());

        System.out.println(circle.toString());
        System.out.println(circle.calculatePerimeter());
    }
}