package 阿_模板包.数组模板;

/**
 * Create by zhatang on 2020/7/20.
 * 双指针遍历模板
 * 场景：需要数组中两两非自身元素的比较
 *  例如，去重，两数之和，两数之积
 */
public class DoublePointer {
    public void doublePointer(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        /*
        这里处理遍历的任意两个元素 nums[left] nums[right]
         */

        while (left < right) {
            if(true) //左边指针前进的条件
                left++;
            else if(false) //右边指针前进的条件
                right--;
        }
    }
}
