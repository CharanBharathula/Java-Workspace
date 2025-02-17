package BackendCourse.Assignments.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(int positionX, int positionY, int fillColor, int borderColor, int radius) {
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
