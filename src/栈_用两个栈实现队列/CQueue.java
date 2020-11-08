package 栈_用两个栈实现队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Create by zhatang on 2020/6/30.
 */
class CQueue {
    //声明定义两个栈，然后依赖注入（组合）到构造器中
    private Deque<Integer> stack1; //Dueue扩展（继承）Queue接口，比较好实现栈的类
    private Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    //使用注入的栈类来实现这些队列的方法
    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        //特例：如果栈1为空，直接返回-1
        if(stack1.isEmpty())
            return -1;
        //如果不为空
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //全部把stack1的内容倒腾到stack2
        int res = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }
}
