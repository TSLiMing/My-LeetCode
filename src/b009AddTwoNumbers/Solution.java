package b009AddTwoNumbers;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resHead = new ListNode();
        ListNode curNode = resHead;
        int t = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(t % 10, null);
            curNode.next = newNode;
            curNode = curNode.next;
            t /= 10;
        }
        if (t > 0) {
            ListNode newNode = new ListNode(1, null);
            curNode.next = newNode;
        }
        return resHead.next;
    }
}