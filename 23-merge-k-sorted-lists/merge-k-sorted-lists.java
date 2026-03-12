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
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
        
//     }
// }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;

        while(true) {
            int ind = -1;
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < n; j++) {
                if(lists[j] != null && lists[j].val <= min) {
                    ind = j;
                    min = lists[j].val;
                }
            }

            if(ind == -1) break;

            node.next = lists[ind];
            node = node.next;
            lists[ind] = node.next;
        }
        return dummy.next;
    }
}