package 字符串_找到唯一元素;

/**
 * Create by zhatang on 2020/7/28.
 * 当出现唯一元素确定在容器中是唯一只有一个的，其他元素都是出现偶数次的，可以用下面的
 * 唯一元素^元素1^元素1 = 唯一元素
 * 遍历所有元素的同时，返回唯一元素的结果
 * https://leetcode-cn.com/problems/single-number/solution/zhi-chu-xian-yi-ci-de-shu-zi-by-leetcode-solution/
 */
public class Solution {
        public static void main(String[] args) {
            char a = 'b';
            char b = 'a';
            char c = 'a';
            char e = 'a';
            char d = 'a';

            System.out.println((char) (a^b^c^d^e));


            int A = 3;
            int B = 2;
            int C = 2;
            int D = 2;
            int E = 2;
            System.out.println((A^B^C^D^E));
        }
}
