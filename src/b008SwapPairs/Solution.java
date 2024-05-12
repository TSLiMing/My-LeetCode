package b008SwapPairs;

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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode curNode = dummyNode;

        while (curNode.next != null && curNode.next.next != null) {
            ListNode firstNode = curNode.next;
            //交换的左节点
            ListNode secondNode = firstNode.next;
            //交换的右节点
            curNode.next = secondNode;
            //上一次的右节点（交换后）的next指向现在的右节点（即将变成左节点）
            curNode = firstNode;
            //更新到现在的左节点（会被换到右节点）
            firstNode.next = secondNode.next;
            //左节点指向右节点的下一个
            secondNode.next = firstNode;
            //右节点指向左节点完成交换
        }

        return dummyNode.next;
    }
}