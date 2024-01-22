// Literal 
class Literal{
    public static void main(String a[]){
        int num1=0b1001;    // Binary
        int num2=0x4D;      // Hexadecimal
        int num3=100_00_00_000;  // Dec. no. of 0 confusion 
        double num4=12e234;
        char ch='a'; ch++;  // String literal

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(ch);
    }
}