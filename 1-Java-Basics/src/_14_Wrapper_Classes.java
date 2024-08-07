// Wrapper Classes: Provides a way to use primitive data types (int, boolean, ...) as
//                  Objects/Reference Data Type (RDT contains useful methods).
//                  Can be used with Collections.

public class _14_Wrapper_Classes {
    public static void main(String[] args) {
        // Primitive        // Wrapper
        // ---------        // -------
        // boolean          // Boolean
        // char             // Character
        // int              // Integer
        // double           // Double

        // Automatic Conversion by Java Compiler
        // autoboxing: primitive to corresponding Object wrapper class
        // unboxing: wrapper class to primitive type (reverse of autoboxing)

        // autoboxing
        Boolean boolValue = true;
        Character charValue = 'A';
        Integer intValue = 123;
        Double doubleValue = 123.456;

        // unboxing
        if(boolValue==true){
            System.out.println("This is true.");
        }
    }
}
