/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
* 

 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode next = head.next;
        ListNode prev = null;
        ListNode curr = head;
        // 0 1 2 

        while(curr!= null){
            //save the next 
            next = curr.next;
            //System.out.println("next >"+next.val);
            // next = 1
            // reverse the link 
            curr.next = prev;
            if(prev != null){
             System.out.println("prev >"+prev.val);
            }
            //curr.next = null
            
          //  next.next = curr;
            prev = curr;
            curr = next;
           //  System.out.println("curr >"+curr.val);
            
            //curr = 1;
        }
       // head = curr;
        return prev;
    }
}
