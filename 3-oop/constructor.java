// Constructor (Default & Parameterized)

class CoInfo{
    private int age;
    private String name;

    // Constructor | Has same name as Class | Returns Nothing

    public CoInfo(){       
        // Default Constructor
        this.age=18;
        this.name="User";
    }

    public CoInfo(int age, String name){         
        // Parameterized Constructor
        this.age=age;
        this.name=name;
    }

    public void getInfo(){
        System.out.println(name+" | "+age);
    }
}

public class constructor {
    public static void main(String[] args) {
        CoInfo defInfo=new CoInfo();
        defInfo.getInfo();

        CoInfo info=new CoInfo(22,"Kushal");
        info.getInfo();
    }
}

