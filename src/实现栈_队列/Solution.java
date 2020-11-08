package 实现栈_队列;
import java.util.LinkedList;
import java.util.Queue;
/*
 * ��leetcode�ĵ���ģ��
 *
 */
import java.util.Scanner;

class MyStack {

    /**
     * Initialize your data structure here.
     */
    public static Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        if (queue.size() != 1) {
            for (int i = 1; i <= queue.size() - 1; i++) {
                queue.add(queue.remove());
            }
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

class Solution {

    public static void main(String[] args) {


        MyStack stack = new MyStack();

        for (int i = 1; i <= 3; i++) {
            stack.push(i);//��ջ123
        }
        System.out.println(stack.pop());//3
        System.out.println(stack.top());//2
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1
        System.out.println(stack.empty());//is

    }
}
