public class array2d {
    public static void main(String[] args) {
        // 2X3 array
        int d2a[][]=new int[3][4];  

        // Generating random array elements
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                d2a[i][j]=(int)(Math.random()*10);
            }
            System.out.println();
        }

        // Printing array elements
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(d2a[i][j]+"  ");
            }
            System.out.println();
        }

        // Using For Each
        for (int n[] : d2a) {   // Selecting row
            for (int m : n) {    // Selecting value from avobe row
                System.out.print(m+"  ");
            }
            System.out.println();
        }
    }
}
