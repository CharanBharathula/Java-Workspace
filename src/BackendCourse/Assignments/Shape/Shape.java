package BackendCourse.Assignments.Shape;

abstract public class Shape {

    private int positionX;
    private int positionY;
    private int fillColor;
    private int borderColor;

    public Shape(int positionX, int positionY, int fillColor, int borderColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    public void setBorderColor(int borderColor) {
        this.borderColor = borderColor;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getBorderColor() {
        return this.borderColor;
    }

    //methods to calculate area and perimeter for each shape.
    abstract public double calculateArea();

    abstract public double calculatePerimeter();
}
