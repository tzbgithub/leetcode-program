package 面试算法包.找到任意重复元素;

/**
 * Create by zhatang on 2020/9/27.
 * 查找重复数字
 */
public class Main {
    public int findDuplicateNum(int[] nums) {
        int n = nums.length;
        int res = -1;
        for (int i = 0; i < n; i++) {
            while (nums[i] != i) {
                //判断是否跳出来
                int cur = nums[i];
                if (cur == nums[cur]) {
                    res = cur;
                    break;
                } else {
                    //交换
                    swap(nums, i, cur);
                }
            }
            //继续循环
        }
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().findDuplicateNum(new int[]{1, 0, 0, 1, 2}));
    }
}
