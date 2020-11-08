package 阿_模板包.回溯模板;

import sun.security.util.Length;

import java.util.LinkedList;
import java.util.List;

/**
 * Create by zhatang on 2020/7/29.
 * 模板算法解析：https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-xiang-jie-by-labuladong-2/
 */
public class Solution {
    //返回结果作为类成员，全局调用
    private List<List<Character>> res = new LinkedList<>();

    public List<List<Character>> method(char[] nums) {
        LinkedList<Character> track = new LinkedList<>();
        backtrace(nums, track);
        return res;
    }

    private void backtrace(char[] nums, LinkedList<Character> track) {
        //递归结束条件
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            //这里是所有路径，在得到所有路径后的修改请在这里
            return;
        }

        //for循环中的递归
        for (int i = 0; i < nums.length; i++) {
            //过滤：如果是以前添加过的元素，跳过数组中这个元素
            if (track.contains(nums[i])) {
                continue;
            }

            //做选择(//如果不重复，元素P添加到栈里面,成为新的路径，当前状态和i有关)
            track.add(nums[i]);
            //递归
            backtrace(nums, track);
            //撤销选择（回退状态到元素P添加到栈里面的状态，但是下一个状态就是与i+1有关，因为下一次要添加就是添加i+1）
            track.removeLast();
        }
    }
}


class Test1 {
    public static void main(String[] args) {

    }
}