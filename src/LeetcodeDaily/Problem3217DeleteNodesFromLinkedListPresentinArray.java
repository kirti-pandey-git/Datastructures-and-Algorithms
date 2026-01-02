package LeetcodeDaily;

import java.util.HashMap;
import java.util.Map;

public class Problem3217DeleteNodesFromLinkedListPresentinArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        ListNode cur = head;
        ListNode prev = new ListNode();
        while(cur!=null){
            if(!map.containsKey(cur.val)){
                if(prev.next == null){
                    head=cur;
                }else{
                    prev.next=cur;
                }
                prev=cur;
            }
                cur=cur.next;
        }
        prev.next=null;
        return head;
    }
    public static void main(String []args){
        Problem3217DeleteNodesFromLinkedListPresentinArray solution = new Problem3217DeleteNodesFromLinkedListPresentinArray();
        ListNode head5 =new ListNode(5,null);
        ListNode head4 =new ListNode(4,head5);
        ListNode head3 =new ListNode(3,head4);
        ListNode head2 =new ListNode(2,head3);
        ListNode head =new ListNode(1,head2);
        int []nums = {1,2,3};
//        ListNode head5 =new ListNode(2,null);
//        ListNode head4 =new ListNode(1,head5);
//        ListNode head3 =new ListNode(2,head4);
//        ListNode head2 =new ListNode(1,head3);
//        ListNode head1 =new ListNode(2,head2);
//        ListNode head =new ListNode(1,head1);
//        int []nums = {1};

//        ListNode head3 =new ListNode(9,null);
//        ListNode head2 =new ListNode(10,head3);
//        ListNode head =new ListNode(2,head2);
//        int []nums = {9,2,5};
        solution.modifiedList(nums,head);
    }
}
