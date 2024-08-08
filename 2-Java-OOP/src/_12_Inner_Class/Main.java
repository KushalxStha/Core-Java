package _12_Inner_Class;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.useInner();

        // Without using method
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

// Main.Outer class
class Outer {
    public int outerField = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Value of outerField: " + outerField);
        }
    }

    // Method to instantiate and use the inner class
    void useInner() {
        Inner inner = new Inner();
        inner.display();
    }
}