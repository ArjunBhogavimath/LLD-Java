package designpatterns.stratergydesign.with.stratergy;

public class SpecialDriveStratergy implements DriveStratergy{
    @Override
    public void drive() {
        System.out.println("Special Drive Strategy");
    }
}
