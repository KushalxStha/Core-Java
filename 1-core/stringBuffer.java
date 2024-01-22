public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer name=new StringBuffer("Kushal");

        name.append(" Shrestha");
        name.insert(0, "Mr.");
        
        System.out.println(name.capacity());
        System.out.println(name);
    }
}
