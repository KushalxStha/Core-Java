class A extends Object{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A : Parameter");
    }
}

class B extends A{
    public B(){
        super();    // Used to call super class methods
        System.out.println("in B");
    }
    public B(int n){
        this();  // this() will execute all the consturctor of this class [either Default or Parameterized]
        System.out.println("in B : Parameter");
    }
}

public class thisuper {
    public static void main(String[] args) {
        B obj=new B(5);

        System.out.println(obj);
        // Prints address of the Class B Object 'obj'
    }
}