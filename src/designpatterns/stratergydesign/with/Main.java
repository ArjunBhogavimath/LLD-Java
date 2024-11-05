package designpatterns.stratergydesign.with;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        Vehicle vehicle1 = new FamilyCar();
        //created object of vehicle

        //now call the method
        vehicle.drive();
        vehicle1.drive();
    }
}
