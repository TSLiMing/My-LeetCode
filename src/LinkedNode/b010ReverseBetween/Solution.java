package LinkedNode.b010ReverseBetween;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        int cnt = 1;
        ListNode startNode = dummyNode;
        ListNode endNode = head;
        while (cnt < left) {
            startNode = startNode.next;
            endNode = endNode.next;
            cnt++;
        }
        while (cnt < right) {
            endNode = endNode.next;
            cnt++;
        }

        ListNode recordEnd = endNode.next;
        ListNode recordStart = startNode.next;
        endNode.next = null;
        startNode.next = reverse(startNode.next);
        recordStart.next = recordEnd;

        return dummyNode.next;
    }

    public ListNode reverse(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode aftNode = null;
        while (curNode != null) {
            aftNode = curNode;
            curNode = curNode.next;
            aftNode.next = preNode;
            preNode = aftNode;
        }
        return aftNode;
    }
}