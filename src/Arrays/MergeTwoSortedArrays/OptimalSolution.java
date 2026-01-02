package Arrays.MergeTwoSortedArrays;

public class OptimalSolution {
    public static void main(String[] args) {
        BruteForce mergeArrayObject = new BruteForce();
        int[] arr1={1,2,3,7,9};
        int [] arr2 ={4,6,10,15};
        mergeArrayObject.mergeArray(arr1,arr2);
    }
    public void mergeArray(int[] arr1, int[]arr2) {
        int len = arr2.length+arr1.length;
        int gap = len/2 + len%2;
        int l=0;
        int right=l+gap;
        while(gap>=1){
            while(right<len){
                // both pointers are in array 2
                if(l> arr1.length && right>arr1.length){
                    l=l%arr1.length;
                    right=right%arr1.length;
                    swap(arr2,l,right,arr2);
                }
                // l pointers in array 1 & right in  array 2
                else if(l< arr1.length && right>arr1.length){
                    right=right%arr1.length;
                    swap(arr1,l,right,arr2);
                }
                // both pointers are in array 1
                else if(l< arr1.length && right<arr1.length){
                    swap(arr1,l,right,arr1);
                }
            }
            gap = gap/2 + gap%2;
        }
        System.out.println(arr1 +""+ arr2);
    }
    public void swap(int[]arr1, int index1, int index2,int[]arr2){
        arr1[index1]=arr1[index1]^arr2[index2];
        arr2[index2]=arr1[index1]^arr2[index2];
        arr1[index1]=arr1[index1]^arr2[index2];
    }
}
