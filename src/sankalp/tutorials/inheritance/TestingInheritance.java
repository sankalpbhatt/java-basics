package sankalp.tutorials.inheritance;

public class TestingInheritance {

    public static void main(String [] a){
        Parent parent // This means we are creating a reference variable
                =
                new Parent(); // This means creating an Object

        new Parent().method1(); // This is creating another object

        Child child = new Child();
        child.method1(); // prints I am method1 inside parent
        child.method2(); // prints I am method2 inside child

        parent.method1(); // prints I am method1 inside parent
        parent.method2(); // prints I am method2 inside parent


        Parent newParent = new Child();
        newParent.method1(); // prints I am method1 inside parent
        newParent.method2(); // prints I am method1 inside child

        Child child1 = (Child) new Parent(); // This will give you ClassCastException
        child.method1(); // prints I am method1 inside parent
        child.method2(); // prints I am method2 inside child
    }

}
