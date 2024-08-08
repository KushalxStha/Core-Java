package _03_Anonymous_Object;
// Anonymous Object | Cannot be reused

public class Main {
    public static void main(String[] args) {
        // Both are Different Instances
        new Anonymous();              // 1st Anonymous Object
        new Anonymous().myMethod();   // 2nd Anonymous Object
    }
}
class Anonymous {
    public Anonymous(){
        System.out.println("Object Created.");
    }
    public void myMethod(){
        System.out.println("Inside another Method.");
    }
}

