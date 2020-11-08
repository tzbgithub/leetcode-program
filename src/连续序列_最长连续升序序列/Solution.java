package 连续序列_最长连续升序序列;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Solution {
    /**
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        int longestCount = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curCount = 1;
                while (set.contains(curNum + 1)) {
                    curCount++;
                    curNum++;
                }
                longestCount = longestCount > curCount ? longestCount : curCount;
            }
        }
        return longestCount;
    }
}