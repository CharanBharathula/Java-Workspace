package BackendCourse.Assignments.Shape;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int positionX, int positionY, int fillColor, int borderColor, int width, int height) {
        super(positionX, positionY, fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
