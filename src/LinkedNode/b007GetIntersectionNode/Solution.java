package LinkedNode.b007GetIntersectionNode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode tempA = headA, tempB = headB;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;
        if (lenA < lenB) {
            int tempLen = lenA;
            lenA = lenB;
            lenB = tempLen;
            ListNode tempNode = tempA;
            tempA = tempB;
            tempB = tempNode;
        }

        int cnt = lenA - lenB;
        for (int i = 0; i < cnt; i++) {
            tempA = tempA.next;
        }

        for (int i = 0; i < lenB; i++) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}