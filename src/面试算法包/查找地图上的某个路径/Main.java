package 面试算法包.查找地图上的某个路径;

import sun.font.TrueTypeFont;

/**
 * Create by zhatang on 2020/9/27.
 */
public class Main {
    int row ;
    int col;
    int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean hasPath(char[][] map,char[] path) {

        row = map.length;
        col = map[0].length;
        boolean[][] marked = new boolean[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {

                if (backtrace(map, path, 0, i, j, marked)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrace(char[][] map, char[] path, int pathLen, int i, int j, boolean[][] marked) {
        if (pathLen == path.length) {
            return true;
        }
        //越界条件
        if (i >= row || i < 0 || j >= row || j < 0 || map[i][j] != path[pathLen] || marked[i][j] == true) {
            return false;
        }

        marked[i][j] = true;
        for (int[] d : direction) {
            if (backtrace(map, path, pathLen + 1, i + d[0], j + d[1], marked)) {
                return true;
            }
        }
        marked[i][j] = false;
        return false;
    }

}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().hasPath(new char[][]{{'1', '2'}, {'3', '4'}}, new char[]{'1','4'}));
    }
}