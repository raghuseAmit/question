class MyHashSet {
    private static class ListNode {
        int key;
        ListNode next;
        ListNode(int key) {
            this.key = key;
            this.next = null;
        }
    }
    
    private ListNode[] buckets;
    private int capacity;
    
    public MyHashSet() {
        capacity = 10000;
        buckets = new ListNode[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new ListNode(0);
        }
    }
    
    private int hash(int key) {
        return key % capacity;
    }
    
    public void add(int key) {
        int idx = hash(key);
        ListNode curr = buckets[idx];
        while (curr.next != null) {
            if (curr.next.key == key) return;
            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }
    
    public void remove(int key) {
        int idx = hash(key);
        ListNode curr = buckets[idx];
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        ListNode curr = buckets[idx];
        while (curr.next != null) {
            if (curr.next.key == key) return true;
            curr = curr.next;
        }
        return false;
    }
}