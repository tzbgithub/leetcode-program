package 链表_链表分割_创建链表分割;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 4, 5, 2};
        ListNode list = util.createLinkedList(testArr);

        util.printLinkedList(solu.partition(list, 3));
//    System.out.println(solu.partition(list,3));
    }
}