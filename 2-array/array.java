class Array{
    public static void main(String[] args) {
        int arr[]={4,5,3,8};
        arr[2]=7;

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // When we don't know the values of an Array. Default values will be 0.
        int[] arr2=new int[3]; 
        arr2[1]=15;

        // For Each loop
        for(int i:arr2){
            System.out.println(i);
        }
    }
}