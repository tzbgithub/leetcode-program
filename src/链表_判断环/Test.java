package 链表_判断环;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list = util.createLinkedList(testArr);
        System.out.println(solu.hasCycle(list));
//    util.printLinkedList(list);        
    }
}