package 链表操作;

public class Leetcode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int sum = 0, carry = 0;
        while (l1 != null || l2 != null){
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            sum = l1Val + l2Val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            head.next = node;
            head = head.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry != 0) head.next = new ListNode(carry);
        return dummy.next;
    }
}
