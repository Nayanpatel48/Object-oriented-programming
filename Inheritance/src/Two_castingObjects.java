//always do investigating study because it is best in its own

public class Two_castingObjects {
    public static void main(String[] args) {

        //------------------------------implicit casting------------------
        Object obj = new MountainBike1(2,3,4,9);
        //here obj object is of type both Object and MountainBike1

//        MountainBike1 obj1 = obj;
        //this will cause error because compiler does not know that obj is of type
        //MountainBike1 so we have to tell the compiler explicitly as below that we
        //promise that obj is of type MountainBike1

        //--------------------------------explicit casting--------------------
        if (obj instanceof MountainBike) {
            MountainBike myBike = (MountainBike)obj;
        }
//        his cast inserts a runtime check that obj is assigned a MountainBike so that
//        the compiler can safely assume that obj is a MountainBike. If obj is not a
//        MountainBike at runtime, an exception will be thrown.
//
//        Note: You can make a logical test as to the type of a particular object using
//        the instanceof operator. This can save you from a runtime error owing to an improper cast.
    }
}
class Bicycle1 {
    //the bicycle class has three fields
    private int cadence;
    protected int speed;

    int gear;

    //parameterized constructor
    public Bicycle1(int startCadence, int startSpeed, int startGear){
        this.cadence=startCadence;
        this.gear=startGear;
        this.speed=startSpeed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
class MountainBike1 extends Bicycle1{ // subclass of Bicycle
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike1(int startHeight, int startCadence,
                        int startSpeed, int startGear) {

        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public void printSuperProperties() {
        System.out.println(speed);
        //this will work because speed is a protected property

        //System.out.println(cadence);
        //error occurs because cadence is a private so it can be only accessed using
        //getter method defined in only that super class only

        System.out.println(gear);
        //this will work because by default gear is public
    }
}