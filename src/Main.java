import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[1];
        circles[0] = new Circle(new Point(0, 0), 1);

        ColoredCircle[] coloredCircles = new ColoredCircle[1];
        coloredCircles[0] = new ColoredCircle(new Point(3, 3), 1, "CZERWONY");

        obwod(circles);

        obwodKolorowychKol(coloredCircles);
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

}