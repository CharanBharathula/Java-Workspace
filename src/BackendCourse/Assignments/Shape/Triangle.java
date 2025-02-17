package BackendCourse.Assignments.Shape;

public class Triangle extends Shape {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int positionX, int positionY, int fillColor, int borderColor, int side1, int side2, int side3) {
        super(positionX, positionY, fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getSide1() {
        return this.side1;
    }

    public int getSide2() {
        return this.side1;
    }

    public int getSide3() {
        return this.side1;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

}
