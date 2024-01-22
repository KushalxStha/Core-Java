// Type Conversion & Casting

class TypeConversion{
    public static void main(String a[]){
        // Implicit (Conversion)
        byte by=56;
        int num=by;

        // Explicit (Casting)
        int num2=257;
        byte by2=(byte)num2;      // 257 % 256 (Range)

        // Type Promotion
        byte b1=10;
        byte b2=30;
        int result=b1*b2;

        System.out.println(num);
        System.out.println(by2);
        System.out.println(result);
    }
}