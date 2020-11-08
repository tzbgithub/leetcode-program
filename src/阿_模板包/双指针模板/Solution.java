package 阿_模板包.双指针模板;

/**
 * Create by zhatang on 2020/8/2.
 */
// 双指针模板
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = -1;
        while(left<right){ //保持不变，双指针相遇跳出循环
            int area = 0;
            if(height[left]<height[right]){ //修改地方：自定义左指针前进条件
                //核心业务
                area = height[left]*(right-left);
                left++;
            }else if(height[left]>height[right]){ //修改地方：自定义右指针前进条件
                //核心业务
                area = height[right]*(right-left);
                right--;
            }
            res = Math.max(res,area);
        }
        return res;
    }
}