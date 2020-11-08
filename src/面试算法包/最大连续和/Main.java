package 面试算法包.最大连续和;

/**
 * Create by zhatang on 2020/10/3.
 */
public class Main {


    int maxV(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            //只要sum不是为负数，说明存储的sum就不用重置
            sum = sum > 0 ? sum + i : i;
            maxValue = Math.max(maxValue, sum);
        }
        return maxValue;
    }


}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().maxV(new int[]{2,3,4,5,-1,-2}));
    }
}