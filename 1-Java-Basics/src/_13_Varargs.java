// Varargs: A method parameter that takes a variable number of arguments.
//          The parameter type must be single dimensional array.

public class _13_Varargs {
    public static void main(String[] args) {

        double Total = Checkout(15.6, 12.8, 13.9);
        System.out.println("The total cost of products is "+Total);
    }

    static double Checkout(double... prices)
    {
        double total = 0;
        for (double pr: prices)
        {
            total += pr;
        }
        return total;
    }
}
