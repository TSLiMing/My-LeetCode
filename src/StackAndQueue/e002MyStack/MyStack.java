package StackAndQueue.e002MyStack;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    Queue<Integer> storeQueue;

    public MyStack() {
        storeQueue = new ArrayDeque<>();
    }

    public void push(int x) {
        storeQueue.add(x);
    }

    public int pop() {
        circleTheQueue();
        return storeQueue.remove();
    }

    public int top() {
        circleTheQueue();
        int res = storeQueue.peek();
        storeQueue.add(storeQueue.remove());
        return res;
    }

    public void circleTheQueue() {
        int times = storeQueue.size() - 1;
        for (int i = 0; i < times; i++) {
            storeQueue.add(storeQueue.remove());
        }
    }


    public boolean empty() {
        return storeQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */