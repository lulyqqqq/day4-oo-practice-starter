package afs.training.oo;

public class Vehicles {
    private String name;
    private int speed;
    private int acceleration;

    public Vehicles(String name, int speed,int acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public void SpeedUp() {
        speed += acceleration;
        System.out.printf("%s:speed up to %d km/h\n", name, speed);
    }
}
