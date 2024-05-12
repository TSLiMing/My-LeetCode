package LinkedNode.b001RemoveElements;


public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode preNode = head, curNode = head.next;
        while (curNode != null) {
            if (curNode.val == val) {
                preNode.next = curNode.next;
                curNode = preNode.next;
            } else {
                curNode = curNode.next;
                preNode = preNode.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}