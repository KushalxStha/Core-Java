public class _15_Exception_Handling {
    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("kk");
            // Below codes will not get executed, if there is an Exception
            System.out.println(myInt + " After Parsing");
            return;
        }
        catch (NumberFormatException | NullPointerException e) {  // Alternative for multiple catch {} block
            System.out.println("---Error---\n"+e);
        }
        finally {  // Runs whether there is an exception or not (even if there is return)
            System.out.println("In Finally Block");
        }
        System.out.println("Ends Here.");

        System.out.println("Another Try Catch: " + printANumber());
    }

    public static int printANumber(){
        try {
            return 3;
        }
        catch (Exception e){
            return 4;
        }
        finally {
            return 5;
            // Avoid using return in finally
        }
    }
}
