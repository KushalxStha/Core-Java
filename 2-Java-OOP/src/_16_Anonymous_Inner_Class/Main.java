package _16_Anonymous_Inner_Class;
// Anonymous Inner Class = Useful for creating quick implementations of interfaces or
//                         abstract classes without the need for a separate named class.
// Key Points
// 1. No Name: Anonymous inner classes do not have a name.
// 2. Single Use: Used for instantiating objects with minor variations and usually for short-lived use.
// 3. Limited Scope: They are typically defined within a method or a block of code.

public class Main {
    public static void main(String[] args) {
        Greeting greeting0 = new Greeting();

        // Anonymous Inner Class
        Greeting greeting = new Greeting() {
            @Override
            public void Welcome() {
                System.out.println("Welcome!!!");
            }
        };

        greeting.Welcome();
        greeting0.Welcome();
    }
}

class Greeting{
    public void Welcome(){
        System.out.println("Welcome to Java Core!");
    }
}