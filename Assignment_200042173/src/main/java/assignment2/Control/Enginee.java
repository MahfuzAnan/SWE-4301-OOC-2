package assignment2.Control;

import assignment2.Stamp.Car;

public class Enginee {
    public int enginePowerCalculator(String carName)
    {
        if(carName == "BMW"){
            return 500;
        } else if (carName == "AUDI") {
            return 400;
        } else if (carName== "MARCEDES") {
            return 600;
        }
        else {
            return 300;
        }
    }
}