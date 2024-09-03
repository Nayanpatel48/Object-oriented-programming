/*always do investigative study because it is best*/

//----------------------------static methods-----------------------------------
//If a subclass defines a static method with the same signature as a static method
// in the superclass, then the method in the subclass hides the one in the superclass.

//The distinction between hiding a static method and overriding an instance method has
//important implications:
//->The version of the overridden instance method that gets invoked is the one in the subclass.
// ->The version of the hidden static method that gets invoked depends on whether it is invoked
// from the superclass or the subclass.

public class Four_StaticMethods extends Animal{
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    public static void main(String[] args) {
        Four_StaticMethods myCat = new Four_StaticMethods();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        //o/p:The static method in Animal
        //Note:The static methods declared in the class does not belong to individual
        //instance of the class they can be called using class name only no need to create
        //instance/object of the class

        //Animal.testInstanceMethod();
        //The above statement won't work because 'testInstanceMethod' of Animal class is
        //not static so we need to create object inorder to access it outside parent class
        // need to create an object but here this method is overridden so the method inside
        // subclass will be called

        myAnimal.testInstanceMethod();
        //The instance method in Cat
        //because it is overridden

        testClassMethod();
        //since this static method is the member of this class it can be called as follows ,
        //yes but inorder to call it in other class we need to access it using class name

        Animal a1 = new Animal();
        a1.testInstanceMethod();
        //The instance method in Animal
        //this is the way to access instance method of parent class which is overridden
        //by subclass
    }
}
class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}