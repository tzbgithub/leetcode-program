package 链表_每两个反转_结点next域重赋值;
import  阿_模板包.util.*;
import  阿_模板包.util;

import java.util.Stack;


public class Test {
    private Stack<Integer> stack = new Stack<Integer>();
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list = util.createLinkedList(testArr);
//    System.out.println();
        util.printLinkedList(solu.swapPairs(list));

        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
        System.out.println(s1.get(0));
    }
}