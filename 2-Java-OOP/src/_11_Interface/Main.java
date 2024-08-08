package _11_Interface;
// Interface: another way to achieve Abstraction.
// It is a completely "abstract class" that is used to group related methods with empty bodies.

public class Main {
    public static void main(String[] args) {
        Pig fatPig = new Pig();
        fatPig.makeSound();
        fatPig.sleep();
    }
}

interface Animal {
    void makeSound();
    void sleep();
}

class Pig implements Animal {
    public void makeSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}
