package 链表_第一个交点的位置;
import  阿_模板包.util.*;
import  阿_模板包.util;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list1 = util.createLinkedList(testArr);
        ListNode list2 = util.createLinkedList(testArr);

//    System.out.println();
        util.printLinkedList(solu.getIntersectionNode(list1, list2));
    }
}