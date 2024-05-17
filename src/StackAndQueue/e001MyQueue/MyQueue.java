package StackAndQueue.e001MyQueue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        dumpStackIn();
        return outStack.pop();
    }

    public int peek() {
        dumpStackIn();
        return outStack.peek();
    }

    public void dumpStackIn() {
        if (!outStack.empty()) return;
        while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }
    }

    public boolean empty() {
        return inStack.empty() || outStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */