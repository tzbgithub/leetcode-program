package 面试算法包.奇数和偶数的相对位置不变;

/**
 * Create by zhatang on 2020/9/27.
 */
public class Main {

    public int[]  changeOrder(int[] nums) {
        //第一次扫描得到奇数的个数
        int count = 0;
        for (int num :
                nums) {
            if (isQ(num)) {
                count++;
            }
        }
        System.out.println(count);
        //新数组分区（根据奇数的位置）
        int[] res = new int[nums.length];
        int i = 0;
        int j = count;
        for (int k = 0; k < nums.length; k++) {
            if (isQ(nums[k])) {
                res[i++] = nums[k];
            } else {
                res[j++] = nums[k];

            }
        }
        return res;
    }

    //判断奇偶 return boolean
    static  boolean isQ(int num) {
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

class Test {
    public static void main(String[] args) {
        int[] res = new Main().changeOrder(new int[]{1, 2, 3, 4, 5});
        for (int i :
                res) {
            System.out.println(i);
        }
    }
}

