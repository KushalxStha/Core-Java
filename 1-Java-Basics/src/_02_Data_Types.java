// Non-Primitive: String, Arrays, Classes, Instances

// This is Primitive Data Types
public class _02_Data_Types {
    public static void main(String[] args) {
        // dataType variableName = literals
        int int1 = 0b101;     // Binary precedes by 0b
        int int2 = 0x6C;      // Hex precedes by 0x
        double int3 = 12e11;  // 12*10^11  OR 1.2 * 10^12
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);

        var a = 8;  // [Statically Typed, Inferred Type]
        // The type is determined at compile-time based on the assigned value.
        // Therefore, 'a' is statically typed as an integer.

        boolean myBoolean = true; // 1 bit
        byte myByte = 127;        // 1 byte

        short myShort = 32_767;                   // 2 bytes
        int myInt = 2_147_483_647;                // 4 bytes
        long myLong = 9_223_372_036_854_775_807L; // 8 bytes

        float myFloat = 9.8f;                  // 4 bytes
        double myDouble = 3.1415926_5358979d;  // 8 bytes   (Default Float)

        char myCharCode = 65;          // (ASCII Values) 65 = A
        char myChar = 'K'; myChar++;   // (Single Quote)  2 bytes
        String myString = "Kushal";    // (Double Quote)  2 bytes per char [Non-Primitive]

        System.out.println("Boolean: "+myBoolean);
        System.out.println("Byte: "+myByte);
        System.out.println("Short: "+myShort);
        System.out.println("Int: "+myInt);
        System.out.println("Long: "+myLong);
        System.out.println("Float: "+myFloat);
        System.out.println("Double: "+myDouble);
        System.out.println("Char: "+myChar+" "+myCharCode);
        System.out.println("String: "+myString);
        System.out.println("Var: "+a);

        // Real Life Example
        int items = 20;
        float costPerItem = 65.5f;
        float totalCost = items * costPerItem;
        String currency = "रु";

        System.out.println("No. of Items: "+items);
        System.out.println("Cost per Item: "+ currency + costPerItem);
        System.out.println("Total Cost: " + currency + totalCost);

    }
}

// Difference Between Primitive & Non-Primitive Data Types

// Primitive = Predefined in Java
// Non-Primitive = Created by Programmer (except for String)

// Primitive = Cannot call Methods
// Non-Primitive = Can call Methods to perform certain operations

// Primitive = Always has values
// Non-Primitive = Can be null

// Primitive = Starts with lowerCase
// Non-Primitive = Starts with UpperCase
