package _09_Polymorphism;
// Polymorphism = To have many Forms. Objects can be identified by more than one type

// Dynamic Polymorphism = also known as Runtime polymorphism.
//                Allows a method to behave differently based on the object that invokes it.

public class Main {
    public static void main(String[] args) {
        // We create objects of type Animal but instantiate them as Dog and Cat.
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Dynamic method dispatch
        myDog.makeSound();  // Outputs: Dog barks
        myCat.makeSound();  // Outputs: Cat meows
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
