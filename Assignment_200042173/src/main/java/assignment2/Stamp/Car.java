package assignment2.Stamp;

public class Car {
    public String name;
    public String model;
    public int seats;
    public int enginePower;

    public Car(String name, String model, int seats) {
        this.name = name;
        this.model = model;
        this.seats = seats;
    }

    public void SetEnginePower(){
        this.enginePower = new Engine().enginePowerCalculator(this);
    }
}
