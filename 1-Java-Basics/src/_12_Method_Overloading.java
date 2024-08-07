// Method Overloading: Multiple methods can have same name with different Parameters
//        It is better to overload 1 method instead of defining multiple methods if their task is same.

public class _12_Method_Overloading {
    public static void main(String[] args) {
        System.out.println(add(5,7));
        System.out.println(add(8,12));

        System.out.println(add(5.6f,5.8f));
        System.out.println(add(9.6f,8.7f));
    }

    static int add(int a, int b) {
        return a + b;
    }
    static float add(float a, float b) {
        return a + b;
    }
}
