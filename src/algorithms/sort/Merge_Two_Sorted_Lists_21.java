package algorithms.sort;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Merge_Two_Sorted_Lists_21 {

    public static void main(String[] args) {
        ListNode node1_4 = new ListNode(5, null);
        ListNode node1_3 = new ListNode(2, node1_4);
        ListNode node1_2 = new ListNode(1, node1_3);
        ListNode node1_1 = new ListNode(1, node1_2);

        ListNode node2_5 = new ListNode(7, null);
        ListNode node2_4 = new ListNode(6, node2_5);
        ListNode node2_3 = new ListNode(3, node2_4);
        ListNode node2_2 = new ListNode(2, node2_3);
        ListNode node2_1 = new ListNode(2, node2_2);

        ListNode ret = mergeTwoLists(node1_1, node2_1);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        }

        ListNode ret = null;
        ListNode tail = null;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while (head1 != null && head2 != null) {
            ListNode node = null;
            if (head1.val <= head2.val) {
                node = head1;
                head1 = head1.next;
            } else {
                node = head2;
                head2 = head2.next;
            }
            if (ret == null) {
                ret = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
        }
        tail.next = head1 == null ? head2 : head1;
        return ret;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
