class Phone{
    // Static Variable is used to refer to the common property of all objects
    static String category;
    // Instance Variable
    String brand;
    int price;

    public void show(){
        System.out.println("Category: "+category+" | Brand: "+brand+" | Price: "+price);
    }
}

public class staticVar {
    public static void main(String[] args) {
        Phone obj1=new Phone();
        obj1.brand="Samsung";
        obj1.price=1000;
        // Proper method to use Static Variable
        Phone.category="Smart Phone";

        Phone obj2=new Phone();
        obj2.brand="Apple";
        obj2.price=1200;
        Phone.category="Smart Phone";

        obj1.show();
        obj2.show();
    }
}
