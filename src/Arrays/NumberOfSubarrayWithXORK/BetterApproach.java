package Arrays.NumberOfSubarrayWithXORK;

public class BetterApproach {
    public int numberofSubarray(int[]arr, int kXor){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int xor=0;
            for(int j=i;j<arr.length;j++){
                xor=xor^arr[j];
                if(xor==kXor){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        BetterApproach sp = new BetterApproach();
        int arr[]={4,2,2,6,4};
        System.out.println(sp.numberofSubarray(arr,6));
    }
}
