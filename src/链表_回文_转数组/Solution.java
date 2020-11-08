package 链表_回文_转数组;
import java.util.ArrayList;
import java.util.List;
import  阿_模板包.util.*;
import  阿_模板包.util;

/**
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> listArr = new ArrayList<Integer>();
        while (head != null) {
            listArr.add(head.val);
            head = head.next;
        }

        for (int i : listArr) {
            System.out.println(i);
        }

        for (int i = 0, j = listArr.size() - 1; i < j; i++, j--) {
            System.out.println(i + "the i:" + listArr.get(i));
            System.out.println(j + "the j:" + listArr.get(j));

            if (listArr.get(i).intValue() != listArr.get(j).intValue()) {
                return false;
            }
        }
        return true;
    }
}