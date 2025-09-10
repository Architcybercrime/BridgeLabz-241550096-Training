interface Refuelable { void refuel(); }

class VehicleV {
    int maxSpeed; String model;
    VehicleV(int maxSpeed, String model) { this.maxSpeed = maxSpeed; this.model = model; }
}

class ElectricVehicle extends VehicleV {
    ElectricVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    void charge() { System.out.println(model + " is charging."); }
}

class PetrolVehicle extends VehicleV implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    public void refuel() { System.out.println(model + " is refueling with petrol."); }
}

public class Q11_VehicleHybridSystem {
    public static void main(String[] args) {
        new ElectricVehicle(150, "EV-1").charge();
        new PetrolVehicle(180, "PV-1").refuel();
    }
}