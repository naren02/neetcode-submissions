/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       // step 1, check if there are k nodes in the list
       int count = 0;
       ListNode temp = head;
       while(count < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            count++;
       }
      // Step 2. Head of already reversed LL
      ListNode curr =  reverseKGroup(temp, k);
      // Step 3. Reverse Current Linked List
      ListNode node = head;
      count = 0;
      //4 5 6 
      //1 2 3 
      while(count < k){
        ListNode next = node.next;
   //     System.out.println("Next "+ next.val);
        node.next = curr;
       
        curr = node;
         System.out.println("Node "+ node.val);
        node = next;
          System.out.println("Curr "+ curr.val);
        count++;
      }
      return curr;

    }
}
