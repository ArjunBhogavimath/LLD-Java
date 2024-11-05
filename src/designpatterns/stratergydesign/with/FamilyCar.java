package designpatterns.stratergydesign.with;

import designpatterns.stratergydesign.with.stratergy.DriveStratergy;
import designpatterns.stratergydesign.with.stratergy.NormalDriveStratergy;

public class FamilyCar extends Vehicle{
    FamilyCar() {
        super(new NormalDriveStratergy());
    }
}
