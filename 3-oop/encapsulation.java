// Encapsulation & Constructor

class PrivInfo{
    // Encapsulation
    private int age;
    private String name;

    public void setInfo(int age, String name){
        this.age=age;
        this.name=name;
        // usefull when using local variable name same as instance variable
    }

    public void getInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        PrivInfo info=new PrivInfo();

        info.setInfo(28, "Krishna");
        info.getInfo();
    }
} 
