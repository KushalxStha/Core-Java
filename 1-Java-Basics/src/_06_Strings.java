public class _06_Strings {
    public static void main(String[] args) {
        String txt = "Hello! I am Kushal Shrestha.";

        // String Methods
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("Kushal"));
        System.out.println((txt.charAt(7)));

        // String Concatenation
        String firstName="Kushal";
        String lastName="Shrestha";
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat(lastName));
        // No String Interpolation in Java

        // Escape Sequence
        System.out.println("Single Quote: ' ");
        System.out.println("Double Quote: \" ");
        System.out.println("Backslash: \\ ");
        System.out.println("New Line: \ntest new line");
        System.out.println("Tab: \ttest tab");
        System.out.println("Backspace: \btest backspace");
    }
}
