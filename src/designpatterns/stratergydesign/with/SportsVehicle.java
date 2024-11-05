package designpatterns.stratergydesign.with;

import designpatterns.stratergydesign.with.stratergy.SpecialDriveStratergy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDriveStratergy());
    }
}
