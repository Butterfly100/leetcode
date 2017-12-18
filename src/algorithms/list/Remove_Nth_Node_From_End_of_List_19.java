package algorithms.list;

/**
 * 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Remove_Nth_Node_From_End_of_List_19 {

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node = removeNthFromEnd(node1, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head || n < 1) {
            return head;
        }
        ListNode start = head;
        ListNode removeBefore = null;
        int count = 1;
        while (start.next != null) {
            start = start.next;
            count++;
            if (n+1 == count) {
                removeBefore = head;
            } else if (n+1 < count) {
                removeBefore = removeBefore.next;
            }
        }
        if (n > count) {
            return head;
        } else if (n == count) {
            return head.next;
        } else {
            removeBefore.next = removeBefore.next.next;
            return head;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

}
