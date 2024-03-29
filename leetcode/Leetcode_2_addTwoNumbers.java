/**
 * <a href=https://leetcode.cn/problems/add-two-numbers>2. 两数相加</a>
 *
 * @Author phoebe
 * @date 2023/2/11
 */
public class Leetcode_2_addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, cur = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            if (head == null) {
                head = cur = new ListNode(sum);
            } else {
                cur.next = new ListNode(sum);
                cur = cur.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return head;
    }
}


