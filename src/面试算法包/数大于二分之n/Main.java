package 面试算法包.数大于二分之n;

public class Main {

    int mostNum(int[] nums) {
        int count = 1;
        int temp = nums[0];
        for (int i = 1;i<nums.length;i++) {
            int cur = nums[i];
            if (count == 0) {
                temp = cur;
            }
            if (cur == temp) {
                count++;
            } else {
                count--;
            }
        }
        return temp;
    }

}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().mostNum(new int[]{2,2,1,1,1,2,2}));
    }
}

