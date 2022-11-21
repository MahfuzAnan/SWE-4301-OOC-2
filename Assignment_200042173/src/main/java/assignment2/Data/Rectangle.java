package assignment2.Data;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(int length, int width)
    {
        AreaCalculator areaCalculator = new AreaCalculator();
        return areaCalculator.calculateArea(length, width);
    }
}