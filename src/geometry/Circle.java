package geometry;

public class Circle {

    private Point center;
    private double radius;

    @java.lang.Override
    public java.lang.String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return Math.PI * (2 * this.radius);
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}
