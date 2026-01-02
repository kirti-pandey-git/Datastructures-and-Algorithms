package LeetcodeDaily;

import Recursion.Solution;

public class Problem2125NumberOfLaserBeams {
    public int numberOfBeams(String[] bank) {
        int res=0;
        String indexZero = bank[0];
        int previousOneCount= indexZero.length()-indexZero.replaceAll("1","").length();
        for(int i=1;i< bank.length;i++){
            int countOne = (int) bank[i].chars().filter(ch->ch=='1').count();
            if(countOne>0){
                res+=(previousOneCount*countOne);
                previousOneCount=countOne;
            }
        }
        return res;
    }
    public static void main(String []args){
        Problem2125NumberOfLaserBeams solution = new Problem2125NumberOfLaserBeams();
        String[]bank = {"011001","000000","010100","001000"};
        int res = solution.numberOfBeams(bank);
        System.out.println(res);
    }
}
