public class _11_Methods {
    public static void main(String[] args) {
        // Calling Methods with Arguments

        // Static Methods can be called without creating an Object
        userInfo("John",40);
        userInfo("Jane",30);

        // Public Methods must be called by creating an Object
        _11_Methods table = new _11_Methods();
        table.multiplicationTable(5,10);
        table.multiplicationTable(34,20);

        System.out.println(add(45,55));
        System.out.println(add(55.55,66.66));
    }

    // Defining Method with Parameters

    // Static method
    static void userInfo(String name, int age){
        System.out.println(name+" is "+age+" years old.");
    }

    // Public method
    public void multiplicationTable(int a, int b){
        for(int i=1;i<=b;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }

    // Methods with Return Values
    static  double add(double a, double b){
        return a+b;
    }
}
