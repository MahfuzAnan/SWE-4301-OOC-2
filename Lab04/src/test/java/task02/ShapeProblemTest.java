package task02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeProblemTest {
    @Test
    public void TestCircle()
    {
        String expected = "Drawing Circle";

        Circle circle = new Circle();
        assertEquals(expected, circle.PrintShape());
    }

    @Test
    public void TestSquare()
    {
        String expected = "Drawing Square";

        Square square = new Square();
        assertEquals(expected, square.PrintShape());
    }

    @Test
    public  void TestRectangle()
    {
        String expected = "Drawing Rectangle";

        Rectangle rectangle = new Rectangle();
        assertEquals(expected, rectangle.PrintShape());
    }

    @Test
    public void TestShapes()
    {
        String expected = "Drawing Circle\n" +
                "Drawing Square\n" +
                "Drawing Rectangle\n";

        ShapesList shapesList = new ShapesList();
        Circle c = new Circle();
        Square s = new Square();
        Rectangle r = new Rectangle();
        IShape[] shapes = {c, s, r};
        assertEquals(expected, shapesList.Shapes(shapes));
    }
}