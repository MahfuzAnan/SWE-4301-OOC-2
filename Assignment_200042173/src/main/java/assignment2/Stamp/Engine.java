package assignment2.Stamp;

public class Engine {
    public int enginePowerCalculator(Car car)
    {
        if(car.name == "BMW"){
            return 500;
        } else if (car.name == "AUDI") {
            return 400;
        } else if (car.name == "MARCEDES") {
            return 600;
        }
        else {
            return 300;
        }
    }
}
