package algorithms.list;

/**
 * 24. Swap Nodes in Pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class Swap_Nodes_in_Pairs_24 {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node = swapPairs(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode tmp = null;
        ListNode node = head;
        ListNode before = null;
        if (head != null && head.next != null) {
            head = head.next;
        } else {
            return head;
        }
        while (node != null) {
            if (null == tmp) {
                tmp = node;
                node = node.next;
            } else {
                tmp.next = node.next;
                node.next = tmp;
                if (before != null) {
                    before.next = node;
                }
                node = tmp.next;
                before = tmp;
                tmp = null;
            }
        }
        return head;
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
