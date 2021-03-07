package 链表操作;

public class Leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode oldHead = head;
        int n;
        for (n = 1; oldHead.next != null; n++){
            oldHead = oldHead.next;
        }
        oldHead.next = head;
        ListNode newHead = head;
        for (int i = 1; i != n - k % n; i++){
            newHead = newHead.next;
        }
        ListNode ans = newHead.next;
        newHead.next = null;
        return ans;
    }
}
