package LeetcodeDaily;

public class Problem3356MakeArrayElementEqualToZero {
    public int countValidSelections(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int sumLtoR=nums[0];
        int sumRtoL=nums[nums.length-1];
        int ans=0;
        int previ=0;
        int prevj=nums.length-1;
        int count=0;
        while(i<j){
            if(i!=previ && sumRtoL!=sumLtoR){
                sumLtoR+=nums[i];
            }
            if(j!=prevj && sumRtoL!=sumLtoR){
                sumRtoL+=nums[j];
            }
            if(nums[i]==0 || nums[j]==0){
                if(sumLtoR==sumRtoL){
                    ans+=2;
                    if(nums[i]==0){
                        previ=i;
                        i++;
                    }
                    else {
                        prevj=j;
                        j--;
                    }
                } else if(sumLtoR+1==sumRtoL){
                    ans++;
                    prevj=j;
                    j--;
                } else if(sumLtoR==sumRtoL+1){
                    ans++;
                    previ=i;
                    i++;
                } else{
                    if(nums[i]==0){
                        previ=i;
                        i++;
                    }
                    else {
                        prevj=j;
                        j--;
                    }
                }
            }
            else if(sumLtoR<sumRtoL){
                previ=i;
                i++;
            } else if(sumLtoR>sumRtoL){
                prevj=j;
                j--;
            }
            count++;
        }
        return ans;
    }
        public int countValidSelections1(int[] nums) {
            int n = nums.length;
            int ans = 0;
            int sum = 0;
            for (int x : nums) {
                sum += x;
            }
            int leftSum = 0;
            int rightSum = sum;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    if (leftSum - rightSum >= 0 && leftSum - rightSum <= 1) {
                        ans++;
                    }
                    if (rightSum - leftSum >= 0 && rightSum - leftSum <= 1) {
                        ans++;
                    }
                } else {
                    leftSum += nums[i];
                    rightSum -= nums[i];
                }
            }
            return ans;
        }
    public static void main(String []args){
        Problem3356MakeArrayElementEqualToZero solution = new Problem3356MakeArrayElementEqualToZero();
        int[]bank = {1,0,2,0,3};
        int res = solution.countValidSelections(bank);
        System.out.println(res);
    }

}
