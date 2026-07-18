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
      while(count < k){
        temp.next = node.next;
        node.next = curr;
        curr = node;
        node = temp.next;
        count++;
      }
      return head;

    }
}
