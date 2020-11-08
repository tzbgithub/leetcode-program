package 链表_两个链表相加;
import java.util.Stack;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list1 = util.createLinkedList(testArr);
        ListNode list2 = util.createLinkedList(testArr);

        //    System.out.println();
        util.printLinkedList(solu.addTwoNumbers(list1, list2));

        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
        System.out.println(s1.get(0));
    }
}