package LinkedNode.b003DeleteNode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyNode = new ListNode(val);
        dummyNode.next = head;

        for (ListNode preNode = dummyNode, curNode = dummyNode.next; curNode != null; preNode = preNode.next, curNode = curNode.next) {
            if (curNode.val == val) {
                preNode.next = curNode.next;
                break;
            }
        }
        return dummyNode.next;
    }
}