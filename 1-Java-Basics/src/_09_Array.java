public class _09_Array {
    public static void main(String[] args) {
        // 1. Array
        int[] ages={15,18,17,21,23,19};
        ages[0]=17;   // Changing array element
        float average, sum=0;

        for(int i:ages){
            System.out.println(i);
            sum+=i;
        }
        average=sum/ages.length;
        System.out.println("Average age is "+average);

        // 2. When we don't know the values of an Array. Default values will be 0.
        int[] arr2=new int[3];
        arr2[1]=15;

        for(int i:arr2){
            System.out.println(i);
        }

        // 3. 2-Dimensional Array
        int[][] twoDArr = new int[2][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                // Generating Random Array Elements
                twoDArr[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                // Printing Array Elements
                System.out.print(twoDArr[i][j]+"  ");
            }
            System.out.println(); // To print in next line
        }

        // Using For Each [Advantage: No need to know the length of an Array]
        for (int[] i : twoDArr) {   // Selecting row
            for (int j : i) {       // Selecting value from above row
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        // 4. Jagged Array
        int[][] nums =new int[3][];
        // Different no. of Columns in each Rows
        nums[0]=new int[4];
        nums[1]=new int[5];
        nums[2]=new int[3];

        for (int[] i : nums) {
            for (int j : i) {
                j=(int)(Math.random()*10);
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
