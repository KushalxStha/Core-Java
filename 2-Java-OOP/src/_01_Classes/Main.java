package _01_Classes;
// Class = A bundle of related codes.
//         Used as blueprints to create Objects.

public class Main {
    public static void main(String[] args) {
        Message.hello();
        Message.waiting();
        Message.bye();
    }
}

class Message{
    static void hello() {
        System.out.println("Hello! Welcome to the program.");
    }

    static void waiting() {
        System.out.println("I was waiting for code to get executed.");
    }

    static void bye() {
        System.out.println("Bye! Thanks for visiting the program.");
    }
}

