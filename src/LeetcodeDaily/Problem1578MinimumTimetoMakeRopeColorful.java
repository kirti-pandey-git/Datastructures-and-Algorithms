package LeetcodeDaily;

public class Problem1578MinimumTimetoMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int minCost=neededTime[0];
        int maxVal=Math.max(neededTime[0], neededTime[1]);
        int reqBallons=0;
        for(int i=1;i<neededTime.length;i++) {
            minCost += neededTime[i];
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                maxVal = Math.max(maxVal, neededTime[i]);
            } else {
                if(maxVal!=-1) {
                    reqBallons+=maxVal;
                }
                reqBallons+=neededTime[i];
                maxVal = -1;
            }
        }
        return minCost-reqBallons;
    }
    public static void main(String []args){
        Problem1578MinimumTimetoMakeRopeColorful solution = new Problem1578MinimumTimetoMakeRopeColorful();
        String colors = "aaabbbabbbb";
        int[]bank = {3,5,10,7,5,3,5,5,4,8,1};
        int res = solution.minCost(colors,bank);
        System.out.println(res);
    }
}
