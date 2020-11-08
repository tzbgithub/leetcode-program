package 面试算法包.二维数组查找;

public class Main {
    int row;
    int col;
//    max数组是升序的按行和列增加升序的
    public boolean searchMatrix(int[][] matrix, int target) {
        row = matrix.length;
        col = matrix[0].length;
//        boolean res;
        int i = 0, j = col-1; //选择位置一定要选择左下角或者右上角，这样每次比较只有一条路径可以走
        while (i < row && j >0) { //二维矩阵灵活的双指针 比起两个for循环更加灵活，而且更加有用
            int cur = matrix[i][j];
            if (target > cur) {
                i++;
            } else if (target < cur) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().searchMatrix(new int[][]{{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22}}, 100));
    }
}

