package afs.training.oo;

public class Driver {
    private Vehicles vehicles;

    public Driver(Vehicles vehicles){
        this.vehicles = vehicles;
    }


    public void Drive(){
        vehicles.SpeedUp();
    }
}
