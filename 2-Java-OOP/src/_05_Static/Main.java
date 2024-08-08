package _05_Static;
// Static: Modifier to declare a static member.
//         Belongs to the Class itself [NOT to any specific object]

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Audi");
        Car.race();
    }
}

class Car {
    public String model; // Instance Variable
    static int noOfCars; // Static Variable
    // Static variable refers to the common property of all objects

    public Car(String model) {
        this.model = model;
        noOfCars++;
    }

    // Static method
    static void race(){
        System.out.println(noOfCars+" cars are racing.");
    }
}