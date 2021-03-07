package 链表操作;

public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp = head;
        while (temp != null){
            ListNode node = temp.next;
            temp.next = pre;
            pre = temp;
            temp = node;
        }
        return pre;
    }
}
