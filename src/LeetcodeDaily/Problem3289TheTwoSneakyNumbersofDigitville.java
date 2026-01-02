package LeetcodeDaily;

import java.util.Arrays;

public class Problem3289TheTwoSneakyNumbersofDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[2];
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;

    }
}
