class Students{
    int roll;
    String name;
    int marks;
}

public class objects {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.roll=1;
        s1.name="Kushal";
        s1.marks=85;

        Students s2=new Students();
        s2.roll=2;
        s2.name="Kristal";
        s2.marks=90;

        Students s3=new Students();
        s3.roll=3;
        s3.name="Krishna";
        s3.marks=80;

        // Creating array "std" of type Students (i.e Class)
        Students std[]=new Students[3];
        std[0]=s1;
        std[1]=s2;
        std[2]=s3;
        // Assigining values to array elements

        for (Students ss : std) {
            System.out.println("Roll no: "+ss.roll+" | Name: "+ss.name+" | Marks: "+ss.marks);
        }
    }
}
