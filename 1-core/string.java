// String and String Methods

class string{
    public static void main(String a[]){
        // String (is class) creates the Object behind the scene
        String txt="Hello World";
        String txt2=" and Universe!";

        System.out.println(txt.length());
        System.out.println(txt.concat(txt2));  // OR use +

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println(txt.indexOf("orld"));
        System.out.println(txt2.charAt(3));
    }
}