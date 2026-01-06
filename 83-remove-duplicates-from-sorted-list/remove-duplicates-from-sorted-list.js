/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
      let current = head;
    while (current !== null) {
        let check = current;
        while (check.next !== null) {
            if (check.next.val === current.val) {
                check.next = check.next.next;
            } else {
                check = check.next;
            }
        }
        current = current.next;
    }
    return head;
};
