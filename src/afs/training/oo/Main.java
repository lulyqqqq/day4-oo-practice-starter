package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Cool Bus",30);
        bus.SpeedUp();

        Truck truck = new Truck("big truck",20);
        truck.SpeedUp();
    }
}