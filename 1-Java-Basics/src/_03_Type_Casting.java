public class _03_Type_Casting {
    public static void main(String[] args)
    {
        // Implicit/Widening/Automatic Casting: Smaller type to a Larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 5;
        double myDouble;
        myDouble = myInt;
        System.out.println(myInt+"\n"+myDouble);

        // Explicit/Narrowing/Manual Casting: Larger type to a Smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble2 = 6.6;
        int myInt2 = (int) myDouble2;  // Truncates
        int myInt3_rounded = (int) Math.round(myDouble2);  // Round off
        System.out.println(myDouble2+"\n"+myInt2+"\n"+myInt3_rounded);

        // Type Promotion
        byte b1=10;
        byte b2=30;
        int result = b1*b2;
        System.out.println(result);

        // Real Life Example
        int maxScore = 500;
        int userScore = 426;
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User Percentage is "+percentage);
    }
}