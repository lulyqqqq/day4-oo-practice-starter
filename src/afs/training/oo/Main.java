package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Vehicles bus = new Bus("Cool Bus",30,5);
        Driver driver = new Driver(bus);
        driver.Drive();

        Vehicles truck = new Truck("big truck",25,2);
        driver = new Driver(truck);
        driver.Drive();

    }
}