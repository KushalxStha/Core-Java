package _07_Inheritance;

public class Main {
    public static void main(String[] args) {
        MiniCar car = new MiniCar();
        car.honk();
        car.carModel("Lamborghini");
        car.size(2);
    }
}

// Super Class (Parent)
class Vehicle{
    public void honk(){
        System.out.println("It can honk");
    }
}

// Sub Class (Child)
// 1. Single Inheritance [A → B]
class Car extends Vehicle{
    public void carModel(String model){
        System.out.println("Car model is "+model);
    }
}

// 2. Multilevel Inheritance [A -> B -> C]
class MiniCar extends Car {
    public void size(int seats){
        System.out.println("It has "+seats+" seats");
    }
}

// 3. Hierarchical Inheritance [A → B, A -> C]
// 4. Multiple Inheritance (Through Interfaces) [A, B, C → D]
// 5. Hybrid Inheritance (Through Interfaces)   [A,B.C -> D, D->E]