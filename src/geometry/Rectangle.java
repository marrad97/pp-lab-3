package geometry;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
