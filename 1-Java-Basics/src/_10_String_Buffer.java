// String [Immutable] : Cannot be changed or Modified
// StringBuffer [Mutable] : Can be Changed or Modified
// StringBuilder : Same as S-Buffer BUT not Thread Safe (suitable for Single Threaded Env. to make it Faster)

public class _10_String_Buffer {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Kushal");

        name.append(" Shrestha");
        System.out.println(name);

        name.insert(0,"Mr. ");
        System.out.println(name);

        name.replace(4,10,"Kristal");
        System.out.println(name);

        name.delete(4,12);
        System.out.println(name);

        name.reverse();
        System.out.println(name);
    }
}
