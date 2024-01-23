public class arrayJagged {
    public static void main(String[] args) {
        // Jagged Array
        int nums[][]=new int[3][];
        // Different no. of cols in each rows
        nums[0]=new int[4];
        nums[1]=new int[5];
        nums[2]=new int[3];

        for (int n[] : nums) {
            for (int m : n) {
                m=(int)(Math.random()*10);
                System.out.print(m+"  ");
            }
            System.out.println();
        }
        // Advantage of For each: No need to know the length of an Array
    }
}
