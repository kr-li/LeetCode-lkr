package 快慢指针遍历;

import 链表操作.ListNode;

public class Leetcode876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true){
            if (fast.next == null) return slow;
            else if (fast.next.next == null) return slow.next;
            fast = fast.next.next;
            slow = slow.next;
        }
    }
}
