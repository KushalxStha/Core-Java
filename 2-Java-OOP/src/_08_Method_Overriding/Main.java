package _08_Method_Overriding;
// Method Overriding = Provides a new version of a method Inherited from a parent class

public class Main {
    public static void main(String[] args) {
        var animal = new Animal();
        var dog = new Dog();

        animal.makeSound();
        dog.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.println("The animal makes sound.");
    }
}

class Dog extends Animal{
    @Override  // Optional but Recommended | Compile-Time Safety
    public void makeSound(){
        System.out.println("The dog barks.");
    }
}

// CTS: Helps catch errors early during compilation rather than at runtime.
