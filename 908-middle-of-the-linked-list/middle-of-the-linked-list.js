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
var middleNode = function(head) {
    let slowPoin = head;
    let fastPoin = head;

    while (fastPoin !== null && fastPoin.next !== null) {
        slowPoin = slowPoin.next;
        fastPoin = fastPoin.next.next;
    }

    return slowPoin;
};
