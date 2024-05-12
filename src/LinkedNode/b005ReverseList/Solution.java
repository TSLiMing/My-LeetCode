package LinkedNode.b005ReverseList;

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

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null, curNode = head;
        ListNode tempNode = null;

        if (curNode == null) {
            return head;
        }

        while (curNode != null) {
            tempNode = curNode;
            curNode = curNode.next;
            tempNode.next = preNode;
            preNode = tempNode;
        }

        return tempNode;
    }
}
