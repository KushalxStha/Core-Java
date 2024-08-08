package _13_toString;
// toString() = Special method that all object inherits,
//              that returns string (textual representation) of an object.
//              Can be used both implicitly & explicitly

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand="Ford";
        car.color="Red";
        car.year=2024;

        System.out.println(car);              // Implicitly
        System.out.println(car.toString());   // Explicitly
    }
}

class Car{
    String brand;
    String color;
    int year;

    @Override
    public String toString() {
        return brand+"\n"+color+"\n"+year;
    }
}
