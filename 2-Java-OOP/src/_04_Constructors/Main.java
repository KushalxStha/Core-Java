package _04_Constructors;
// Constructor = A special method in a class. Called when Object is created.
//               Same name as the class. No return type.
//               Used to assign arguments to fields when creating an objects.

public class Main {
    public static void main(String[] args) {
        var student1 = new Student("John", 22);
        var student2 = new Student("Jane", 21);
        var student3 = new Student("Jack", 23);

        // Creating an Array 'std' of Type Main.Student (i.e., Class) [Array of Objects]
        Student[] std = new Student[] {student1, student2, student3};

        for (Student i : std){
            i.info();
        }
    }
}

class Student{
    String name;
    int age;

    // Constructor [No Return Type]
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
