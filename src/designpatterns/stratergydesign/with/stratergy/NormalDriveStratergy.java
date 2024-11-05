package designpatterns.stratergydesign.with.stratergy;

public class NormalDriveStratergy implements DriveStratergy{

    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}
