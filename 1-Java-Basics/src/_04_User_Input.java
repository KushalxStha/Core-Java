import java.util.Scanner;

public class _04_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the user: ");
        String name = sc.nextLine();

        System.out.println("Enter the age of the user: ");
        int age = sc.nextInt();

        System.out.println("Enter the gender of the user: ");
        String gender = sc.next();

        sc.close();

        System.out.println("The user information:"+
                "\n" + "Name: " + name +
                "\n" + "Age: " + age +
                "\n" + "Gender: " + gender);
    }
}