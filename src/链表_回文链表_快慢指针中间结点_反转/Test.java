package 链表_回文链表_快慢指针中间结点_反转;
import java.util.Stack;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list1 = util.createLinkedList(testArr);
        ListNode list2 = util.createLinkedList(testArr);

        System.out.println(solu.isPalindrome(list1));
//    util.printLinkedList();


    }
}