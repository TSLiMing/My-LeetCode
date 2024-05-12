package LinkedNode.b004ReorderList;


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
    public void reorderList(ListNode head) {
        int size = 0;
        for (ListNode i = head; i != null; i = i.next) {
            size++;
        }
        if (size <= 2) {
            return;
        }

        int mid = (size - 1) / 2;
        int cnt = 0;
        ListNode midNode = head;
        while (cnt < mid) {
            midNode = midNode.next;
            cnt++;
        }

        //reverse
        ListNode preNode = null, curNode = midNode.next, tempNode = null;
        midNode.next = null;
        while (curNode != null) {
            tempNode = curNode;
            curNode = curNode.next;
            tempNode.next = preNode;
            preNode = tempNode;
        }

        //merge
        ListNode leftNode = head, rightNode = tempNode;
        ListNode leftTemp, rightTemp;
        while (leftNode != null && rightNode != null) {
            leftTemp = leftNode.next;
            rightTemp = rightNode.next;
            leftNode.next = rightNode;
            rightNode.next = leftTemp;
            leftNode = leftTemp;
            rightNode = rightTemp;
        }
    }
}