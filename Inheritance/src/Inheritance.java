//always do investigating study because it is best in its own

//subclass = class derived from another class is called as subclass also known as
//child class

//superclass = class from which the subclass is derived is called as superclass.
//it is also known as superclass, baseclass or parent class

//interview question: Object class does not have any super class

//each class has one and only one direct superclass and the class which does
//not have explicit superclass have implicit superclass Object by default in JAVA.

//all the members and properties of superclass can be inherited by subclass but
//constructors cannot be inherited because they are not member of superclass
//but subclass can invoke superclass constructor

//At the top of the hierarchy Object is the most general class

//Advantages of inheritance:
//1->You can inherit super class's members into subclass
//2->You can declare new properties in subclass which are not present in superclass
//3->The inherited methods can be used directly as they are in superclass
//4->You can declare new methods in the subclass which are not in the superclass
//5->You can create subclass constructor which invokes the superclass constructor
//either implicitly or using super keyword

public class Inheritance {
    public static void main(String[] args) {

    }
}
class Bicycle { //superclass of MountainBike class
    //the bicycle class has three fields
    private int cadence;
    protected int speed;

    //--------------------------------------protected------------------------------------
    //by using protected we can access the super class members inside it's subclass ,
    //they can not be accessed from the class which is not a subclass of that superclass

    int gear;

    //parameterized constructor
    public Bicycle(int startCadence, int startSpeed, int startGear){
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
class MountainBike extends Bicycle{ // subclass of Bicycle
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {

        //----------------------------super------------------------------------------
        //super keyword is used to invoke super class's constructor

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