package 链表_依次反转k位;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list = util.createLinkedList(testArr);

        util.printLinkedList(solu.reverseKGroup(list, 2));
    }
}