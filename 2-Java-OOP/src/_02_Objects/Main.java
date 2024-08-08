package _02_Objects;
// Objects: An Instance of a Class.

public class Main {
    public static void main(String[] args) {
        // Creating an Object (named human1) of Human Class
        Human human1 = new Human();

        human1.name="Ram";
        human1.age=18;

        human1.info();
        human1.eat();
    }
}

class Human{
    // Default (package-private) access → accessible within the same package/namespace
    String name;
    int age;

    void info(){
        System.out.println(name+" is "+age+" years old.");
    }

    void eat(){
        System.out.println(name+" is eating.");
    }
}

