// Primitive Data types
class DataTypes{
    public static void main (String a[]){
        byte by=127;         // 1 byte
        int num=5;           // 4 bytes
        short sh=4563;       // 2 bytes
        long lg=92233l;      // 8 bytes  'l' at end 

        float fl=5.63f;          // 4 bytes  'f' at end
        double dl=6.235489664;   // 8 bytes   | Default float

        char ch='K';         // 2 bytes  | only Single Quote
        boolean bo=true;     // 1 bit    | only true OR false

        System.out.println(by+"\n"+num+"\n"+sh+"\n"+lg+"\n"+fl+"\n"+dl+"\n"+ch+"\n"+bo);
    }
}