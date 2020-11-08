package 阿_模板包.二分法模板;

/**
 * Create by zhatang on 2020/8/5.
 */

public class MultiSameValueRightOne {
    public int binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { //条件需要修改
                left = mid + 1; //排除掉这个找到的元素，然后右边区间不动，左边区间缩小
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        //防止一直往左边缩小有边界导致的越界
        if (right <0 || arr[right] != target) {

            return -1; //返回值可能需要防止越界进行条件判断然后修改
        }
        return right;
    }
}

class Test3 {
    public static void main(String[] args) {
        System.out.println(new MultiSameValueRightOne().binarySearch(new int[]{1, 2, 3,3,3, 4, 5}, 3));
    }
}

