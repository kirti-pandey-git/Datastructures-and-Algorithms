package Arrays.MergeTwoSortedArrays;

import java.util.Arrays;

public class BruteForce {
    public void mergeArray(int[] arr1, int[]arr2){
        int l=arr1.length-1;
        int r=0;
        while(l>=0 && r< arr2.length){
            if(arr1[l]>arr2[r]){
                swap(arr1,l,r,arr2);
                l--;
                r++;
            } else{
                l--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1 +" " +arr2);
    }
    public void swap(int[]arr1, int index1, int index2,int[]arr2){
        arr1[index1]=arr1[index1]^arr2[index2];
        arr2[index2]=arr1[index1]^arr2[index2];
        arr1[index1]=arr1[index1]^arr2[index2];
    }

    public static void main(String[] args) {
        BruteForce mergeArrayObject = new BruteForce();
        int[] arr1={1,2,3,7,9};
        int [] arr2 ={4,6,10,15};
        mergeArrayObject.mergeArray(arr1,arr2);
    }
}
