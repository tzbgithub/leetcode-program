package 阿_模板包.边遍历边回头看模板;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by zhatang on 2020/7/28.
 * 两数之和例子
 * 用hashmap遍历的时候存储下标和值，同时回头看，是否和以前的值组成满足目标和的
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) { //遍历
            if (map.containsKey(target - nums[i])) { //遍历的同时回头看，以前的数据中是否有满足的条件的
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1, -1};
    }
}
//*******************************************************测试*******************************************************

class Test {
    public static void main(String[] args) {
        int[] sum = new Solution().twoSum(new int[]{1, 2, 3, 4}, 3);
        for (int a:
             sum)  {
            System.out.println(a);
        }
        System.out.println();
    }
}