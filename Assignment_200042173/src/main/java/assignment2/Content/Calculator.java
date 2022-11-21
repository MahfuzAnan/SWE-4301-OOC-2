package assignment2.Content;

public class Calculator {
    public void calculate(Cube cube){
        cube.area = cube.length * cube.width;
        cube.volume = cube.length * cube.width * cube.height;
    }
}
