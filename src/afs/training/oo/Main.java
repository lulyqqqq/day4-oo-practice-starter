package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Engine electricEngine =  new ElectricEngine();
        Vehicles bus = new Bus("Cool Bus",30,electricEngine);
        Driver driver = new Driver(bus);
        driver.Drive();

        Engine gasolineEngine =  new GasolineEngine();
        Vehicles truck = new Truck("big truck",25,gasolineEngine);
        driver = new Driver(truck);
        driver.Drive();

    }
}