package 阿_模板包.回溯模板;

/**
 * Create by zhatang on 2020/8/6.
 * 给 [1,2,3] 求所有不重复的子集合
 * 求所有解的方法: 回溯
 * trace添加到res没有长度限制，所以不用if语句控制，直接每次进入backtrace就添加一个结果
 *
 */
import java.util.LinkedList;
import java.util.List;
class Solution3 {

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> trace = new LinkedList<>();
        backtrace(0, trace, nums);
        return res;
    }

    private void backtrace(int i, LinkedList<Integer> trace, int[] nums) {
        //中间没有控制字符长度的限制，所以没有到达某个长度就停止掉的if控制语句
        res.add(new LinkedList<>(trace));
        //不是从头开始添加，就是可选列表 = nums每次添加后剩下的列表
        for (int j = i; j < nums.length; j++) {
            trace.add(nums[j]);
            backtrace( j+ 1, trace, nums);
            trace.removeLast();
        }
    }
}



class Test3 {
    public static void main(String[] args) {
        System.out.println(new Solution3().subsets(new int[]{1, 2, 3}));
    }
}
