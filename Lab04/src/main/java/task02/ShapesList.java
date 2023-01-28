package task02;

public class ShapesList{
    public String Shapes(IShape[] objects)
    {
        String shapes = "";

        for(int i=0; i<objects.length; i++)
        {
            shapes += objects[i].PrintShape();
            shapes += "\n";
        }
        return shapes;
    }
}
