package geometry;

public class ColoredCircle extends Circle {

    private String color;

    public ColoredCircle(Point center, double radius, java.lang.String color) {
        super(center, radius);
        this.color = color;
    }

    public java.lang.String getColor() {
        return color;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ColoredCircle{" +
                "color=" + color +
                " " +
                super.toString() +
                '}';
    }
}
