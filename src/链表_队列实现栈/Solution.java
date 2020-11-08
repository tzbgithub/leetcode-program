package 链表_队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    /**
     * Initialize your data structure here.
     */
    private Queue<Integer> queue = new LinkedList<Integer>();

    public MyStack() {


    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        int sz = queue.size();
        while (sz > 1) {
            queue.add(queue.remove());
            sz--;
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class Solution {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


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