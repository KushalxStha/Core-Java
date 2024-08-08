package _14_Super_Keyword;
// Super = keyword that refers to the superclass (parent) of an object
//         very similar to 'this' keyword.

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman",45,"$$$");
        // System.out.println(hero1.name +"\n"+ hero1.age +"\n"+ hero1.power);
        System.out.println(hero1);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + "\n" + this.age;
    }
}

class Hero extends Person{
    String power;
    Hero(String name, int age, String power){
        super(name, age); // Sends name & age value to the Constructor of Super class
        // this.name = name;
        // this.age = age;
        this.power = power;
    }

    public String toString(){
        return super.toString() + "\n" + this.power;
    }
}
