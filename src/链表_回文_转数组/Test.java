package 链表_回文_转数组;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {-130, -130};
        ListNode list = util.createLinkedList(testArr);

//    util.printLinkedList();        
        System.out.println(solu.isPalindrome(list));
    }
}