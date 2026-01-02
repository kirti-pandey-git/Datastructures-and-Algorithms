package Arrays.NumberOfSubarrayWithXORK;

import java.util.HashMap;
import java.util.Map;

public class OptimalSolution {
    public int numberofSubarray(int[]arr, int kXor){
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            int x = xor^kXor;
            if(map.containsKey(x)) {
                count+=map.get(x);
                map.put(xor^kXor,map.get(x)+1);
            }else {
                map.put(xor,1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        OptimalSolution sp = new OptimalSolution();
        int arr[]={4,2,2,6,4};
        System.out.println(sp.numberofSubarray(arr,6));
    }
}
