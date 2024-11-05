package designpatterns.stratergydesign.with;

import designpatterns.stratergydesign.with.stratergy.DriveStratergy;

public class Vehicle {

    //Create an object of Drive Strategy Interface (So you can get all the child class which got implemented
    DriveStratergy driveStratergy;

    //Don't do the object creation with new keyword.
    //it will be tightly coupled, and you need to create objects for each child
    //so better do it with constructor injection

    Vehicle(DriveStratergy driveStratergy){
        this.driveStratergy = driveStratergy;
    }

    public void drive(){
        driveStratergy.drive();
        //this will take the object of each child class dynamically
    }
}

//This class is having dynamic objects of DriveStratergy method