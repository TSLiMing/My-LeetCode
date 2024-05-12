package LinkedNode.b006MyLinkedList;

public class MyLinkedList {

    public MyNode headNode;
    public int size;

    public class MyNode {
        public int val;
        public MyNode next;

        public MyNode() {
        }

        public MyNode(int val, MyNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        headNode = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        MyNode curNode = this.headNode;
        for (int i = 0; i < index; i++) {
            curNode = curNode.next;
        }
        return curNode.val;
    }

    public void addAtHead(int val) {
        MyNode newNode = new MyNode(val, this.headNode);
        this.headNode = newNode;
        this.size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }
        MyNode newNode = new MyNode(val, null);
        MyNode curNode = this.headNode;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            this.addAtHead(val);
        } else if (index > size) {
            return;
        } else if (index == size) {
            this.addAtTail(val);
        } else {
            MyNode preNode = this.headNode;
            for (int i = 1; i < index; i++) {
                preNode = preNode.next;
            }
            MyNode newNode = new MyNode(val, preNode.next);
            preNode.next = newNode;
            this.size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) {
            this.headNode = this.headNode.next;
        } else {
            MyNode preNode = this.headNode;
            for (int i = 1; i < index; i++) {
                preNode = preNode.next;
            }
            preNode.next = preNode.next.next;
        }
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */