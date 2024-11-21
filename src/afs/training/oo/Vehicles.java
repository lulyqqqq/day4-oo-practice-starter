package afs.training.oo;

public class Vehicles {
    private String name;
    private int speed;
    private Engine engine;

    public Vehicles(String name, int speed,Engine engine) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
    }

    public void SpeedUp() {
        speed += engine.getAcceleration();
        System.out.printf("%s:speed up to %d km/h\n", name, speed);
    }
}
