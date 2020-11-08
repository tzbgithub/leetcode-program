package 双指针_盛水最多;

/*
 * https://leetcode-cn.com/problems/container-with-most-water/
 *
 */
import java.util.Scanner;

class Solution {
//    public int maxArea(int[] height) {
//        int n =  height.length;
//        int maxS = -1;
//        for(int i =0;i<n ;i++){
//            int areaS;
//            for(int j=i+1;j<n;j++){
//                areaS = height[i]>= height[j] ?  (j-i)*height[j] : (j-i)*height[i];
//                if(areaS > maxS)
//                    maxS = areaS;
//            }
//        }
//        return maxS;
//    }

    public int maxArea(int[] height) {
        int n = height.length;
        int maxS = -1;
        int left = 0;
        int right = n - 1;
        int areaS;
        while (left < right) {
            if (height[left] > height[right]) {
                areaS = height[right] * (right - left);
                right--;
            } else {
                areaS = height[left] * (right - left);
                left++;
            }
            maxS = maxS > areaS ? maxS : areaS;
        }

        return maxS;
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] testArr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solu.maxArea(testArr));
    }
}
