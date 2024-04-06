import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;
import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[1];
        circles[0] = new Circle(new Point(0, 0), 1);

        ColoredCircle[] coloredCircles = new ColoredCircle[1];
        coloredCircles[0] = new ColoredCircle(new Point(3, 3), 1, "CZERWONY");

        Rectangle[] rectangles = new Rectangle[1];
        rectangles[0] = new Rectangle(1,1);

        obwod(circles);

        obwodKolorowychKol(coloredCircles);

        obwodRectangle(rectangles);
    }

    private static void obwodKolorowychKol(ColoredCircle[] coloredCircles) {
        System.out.println("obwody kolorowych kol ->");
        for (ColoredCircle coloredCircle : coloredCircles) {
            coloredCircle.calculateArea(coloredCircle);
        }
    }

    private static void obwod(Circle[] circles) {
        System.out.println("obwody kol ->");
        for (Circle circle : circles) {
            circle.calculateArea(circle);
        }
    }

    private static void obwodRectangle(Rectangle[] rectangles) {
        System.out.println("pola prostokatow ->");
        for (Rectangle rectangle : rectangles) {
            System.out.println("pola -> " + rectangle.calculateArea(rectangle));
        }
    }

}