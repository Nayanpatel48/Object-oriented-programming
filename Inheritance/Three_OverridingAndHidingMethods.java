public class Three_OverridingAndHidingMethods {
    public static void main(String[] args) {
        ElephantChild ele1= new ElephantChild(4,2,600.9,3);
        System.out.println(ele1.getElephantInfo());

        Elephant ele2 = new Elephant(4,2,12000.67);
        System.out.println(ele2.getElephantInfo());
    }
}
class Elephant{
    private int numberOfLegs;
    private int numberOfTrunk;
    private double weight;

    Elephant(int numberOfLegs, int numberOfTrunk, double weight){
        this.numberOfLegs=numberOfLegs;
        this.numberOfTrunk=numberOfTrunk;
        this.weight=weight;
    }
    public String getElephantInfo(){
        return "Elephant has "+numberOfLegs+" legs "+numberOfTrunk+" trunk "+weight+" weight.";
    }

    //getter and setter methods for data integrity
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public int getNumberOfTrunk() {
        return numberOfTrunk;
    }
    public double getWeight() {
        return weight;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs=numberOfLegs;
    }
    public void setNumberOfTrunk(int numberOfTrunk) {
        this.numberOfTrunk=numberOfTrunk;
    }
    public void getWeight(double weight) {
        this.weight=weight;
    }
}
class ElephantChild extends Elephant{
    protected int babyElephantAge;

    ElephantChild(int numberOfLegs, int numberOfTrunk,
                  double weight, int babyElephantAge) {
        super(numberOfLegs,numberOfTrunk,weight);
        this.babyElephantAge=babyElephantAge;
    }
    //---------------------------@Override annotation----------------------
    //it instructs the compiler that you are intended to override method from superclass
    //Here we can use this. to access the parent class's methods into sub class
    //this.geWeight() is one of the examples of it
    @Override
    public String getElephantInfo(){
        return "Elephant has "+this.getNumberOfLegs()+" legs "+
                this.getNumberOfTrunk()+" trunk "+this.getWeight()+" weight and "+
                babyElephantAge+" age.";
    }
}