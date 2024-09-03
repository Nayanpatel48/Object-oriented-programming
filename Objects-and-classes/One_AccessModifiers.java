/*
 always to investigative study because it is best
 NOTE:the class properties must be declared and initialized before they are used
*/
public class One_AccessModifiers {
    public static void main(String[] args) {
        //--------------------------creating objects/instances of classes--------------------
        MyClass class1=new MyClass(90,"English");
        System.out.println(class1.getInfo());
        //90

        class1.setTotalStd(88);
        System.out.println(class1.getInfo());
        //88
        System.out.println("Total classes created="+class1.getTotalClasses());

        //creating 3 more classes
        MyClass class2=new MyClass(50,"OT");
        System.out.println(class2.getInfo());
        MyClass class3=new MyClass(20,"Spanish");
        System.out.println(class3.getInfo());

        class3.setClassName("German");
        //this won't work because string is an immutable data type

        MyClass class4=new MyClass(99,"computer");
        System.out.println(class4.getInfo());

        System.out.printf("Total classes created="+class2.getTotalClasses());
        //4
    }
}
class MyClass
{
    //----------------------------final keyword usage-------------------------
    //private static final int classMaxCapacity = 99;
    //final value can not be changed

    private int totalStd;
    private String className;
    //we have to access className with the help of getter
    // method since it is private

    //--------------------------static keyword usage------------------
    private static int totalClasses=0;
    //this totalClasses variable is associated with the class not with only one object
    //every instance of the class can share this static class variable
    //since it is stored in only one memory location

    //we cannot be able to access totalStd variable outside the class
    //even with dot (.) operator

    //---------------------------this keyword usage--------------------------
    //'this' keyword is used to access its own class members
    MyClass(int totalStd, String className){
        if (totalStd<=99) {
            this.totalStd=totalStd;
        }
        this.totalStd=99;
        this.className=className;
        totalClasses++;
    }

    //-----------------------------getter method-----------------------------
    public int getTotalStd() {
        return totalStd;
    }
    //with the help of getter method we can access private properties form
    // outside of class

    public String getInfo() {
        return className+" class is created with total students "+totalStd;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public String getClassName() {
        return className;
    }

    //-----------------------------setter method usage-------------------------------
    public void setTotalStd(int totalStd){
        this.totalStd=totalStd;
    }
    public void setClassName(String className) {
        this.className=className;
    }
    //we can modify private properties of any class using setter method
    //from outside class
}