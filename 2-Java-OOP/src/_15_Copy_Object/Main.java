package _15_Copy_Object;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kushal");
        Person person2 = new Person(person1);

        System.out.println(person1.getName() + person1);
        System.out.println(person2.getName() + person2);
        // Both have same value but different address
    }
}

class Person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    Person(String name){
        this.setName(name);
    }

    public void copy(Person p){
        this.setName(p.getName());
    }

    Person(Person p){
        this.copy(p);
    }
}
