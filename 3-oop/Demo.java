
class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator m1= new Calculator();
        System.out.println(m1.add(5,9));
        System.out.println(m1.sub(5,9));
        System.out.println(m1.multiply(5,9));
        System.out.println(m1.divide(5,9));
    }
}