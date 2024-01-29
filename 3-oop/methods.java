public class methods {
    // Creating Method
    static void myMethods(){
        System.out.println("Method has been executed.");
    }

    // Method with parameters
    static void methParam(String fname, int age){
        System.out.println(fname+" is "+age);
    }

    // Method that returns Value
    static int methRet(int a,int b){
        return a+b;
    }

    // Method Overloading
    static double methRet(int a,double b, double c){
        return a+b+c;
    }
    public static void main(String[] args){
        // Calling Method
        myMethods();
        methParam("Ram",5);
        methParam("Shyam",10);
        System.out.println("The sum is "+ methRet(5,8));
        System.out.println("The sum is "+ methRet(5,12.6,2));
    }
}
