// Anonymous Object

class ObjAno{
    public ObjAno(){
        System.out.println("Object created.");
    }

    public void show(){
        System.out.println("in a show");
    }
}

public class objAnonymous {
    public static void main(String[] args) {

        // Anonymous Object | Cannot be reused
        new ObjAno().show();

        new ObjAno().show(); // Another A.O | Different from above
    }
}
