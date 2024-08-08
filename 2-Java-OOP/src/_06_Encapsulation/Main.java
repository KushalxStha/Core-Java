package _06_Encapsulation;
// Encapsulation: Make sure that "sensitive" data is hidden from users. To achieve this:
//                variables/attributes → private
//                get and set methods → public (to access and update the value of a private variable)

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        // person1.name="Kushal";   ERROR
        person1.setName("Kushal");
        System.out.println(person1.getName());
    }
}

class Person{
    private String name; // Private = Restricted Access

    // Getter
    public String getName(){
        return name;
    }

    // Setter
    public void setName(String name){
        this.name=name;
    }
}
