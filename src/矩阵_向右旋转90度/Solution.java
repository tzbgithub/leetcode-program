package 矩阵_向右旋转90度;

//https://leetcode-cn.com/problems/rotate-matrix-lcci/
/*
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        int j = 0;
        int k = 0;

        if (n == 1) {
            return;
        }
        while (true) {
            for (int i = 0; i < n - 1 - 2 * k; i++) {

                temp = matrix[i + j][n - 1 - j];
                matrix[i + j][n - 1 - j] = matrix[0 + j][i + j];

                matrix[0 + j][i + j] = matrix[n - 1 - j][n - 1 - i - j];
                matrix[n - 1 - j][n - 1 - i - j] = temp;

                temp = matrix[n - 1 - i - j][0 + j];
                matrix[n - 1 - i - j][0 + j] = matrix[0 + j][i + j];

                matrix[0 + j][i + j] = temp;

            }
            j++;
            k++;
            if ((n - 2 * k == 1) | (n - 2 * k == 0)) {
                break;
            }
        }
    }

}