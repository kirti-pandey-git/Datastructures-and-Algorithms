package Arrays.NumberOfSubarrayWithXORK;

public class BruteForce {
    public int numberofSubarray(int[]arr, int kXor){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int xor=0;
                for(int k=i;k<=j;k++){
                    xor=xor^arr[k];
                    System.out.print(arr[k]+",");
                }
                System.out.print("::"+xor);
                if(xor==kXor){
                    count++;
                }
                System.out.println("");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        BruteForce sp = new BruteForce();
        int arr[]={4,2,2,6,4};
        System.out.println(sp.numberofSubarray(arr,6));
    }
}
