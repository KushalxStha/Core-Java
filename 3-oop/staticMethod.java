class Phone {
    static String category;
    String brand;
    int price;

    public void show() {
        System.out.println("Category: " + category + " | Brand: " + brand + " | Price: " + price);
    }

    public static void show1(Phone obj){
        System.out.println("This is static method.");
        System.out.println("Category: " + category + " | Brand: " + obj.brand + " | Price: " + obj.price);
    }
}

public class staticMethod {

    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.brand = "Samsung";
        obj1.price = 1000;
        Phone.category = "Smart Phone";

        Phone obj2 = new Phone();
        obj2.brand = "Apple";
        obj2.price = 1200;
        Phone.category = "Smart Phone";

        obj1.show();
        obj2.show();

        Phone.show1(obj1);
    }
}
