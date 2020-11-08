package 阿_模板包.二分法模板;

/**
 * Create by zhatang on 2020/8/5.
 */

public class MultiSameValueLeftOne {
    public int binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { //条件需要修改
                right = mid - 1; //当前这个相等的点不需要，然后将区间缩小
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        if (left >= arr.length || arr[left] != target) {

            return -1; //返回值可能需要防止越界进行条件判断然后修改
        }
        return left; //最后缩小的范围才是我们需要的index
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println(new MultiSameValueLeftOne().binarySearch(new int[]{1, 2, 3,3,3, 4, 5}, 3));
    }
}

