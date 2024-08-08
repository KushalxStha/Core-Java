package _10_Abstract;
// Abstraction: Process of hiding certain details and showing only essential information to the user.
//              Abstract keyword is a non-access modifier, used for classes and methods.

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();     // Output: Drawing a circle
        rectangle.draw();  // Output: Drawing a rectangle
    }
}

// Abstract class: Cannot be used to create objects.
// To access it, it must be inherited from another class.
abstract class Shape {
    // Abstract Method: Only in Abstract class | Don't have Body.
    // The body is provided by the subclass (inherited from).
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
