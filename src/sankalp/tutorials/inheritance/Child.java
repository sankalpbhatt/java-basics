package sankalp.tutorials.inheritance;

public class Child extends Parent{

    @Override // It is not important to write Override.
    // anything that is written after @ is called annotation in java
    public void method2(){
        System.out.println("I am method2 inside child");
    }
}
