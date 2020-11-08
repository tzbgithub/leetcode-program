package 图_出入度表的创建_找到入度为0的顶点;
import java.util.Scanner;

public class Solution {
    /**
     思路:有向图,a信任b表示顶点a的出度 = 1 b的入度为0,出入度表记录每一个顶点的出入度的次数
     1-建立入度出度表:
     2-在创建好的入度表中找到入度为0的顶点
     */

    public int findJudge(int N, int[][] trust) {
        int[][] peopleNum = new int[N][2];
        for(int[] preson : trust){
            //trust二维表是N行2列的二维表
            int out = preson[0];
            int in = preson[1];

            peopleNum[out-1][0]++;
            peopleNum[in-1][1]++;
        }
        for(int i =0;i<N;i++){
            if(peopleNum[i][0] == 0 && peopleNum[i][1]==N-1){
                return i + 1;
            }
        }
        return -1;
    }



//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[][] testArr = {{1,2}};//testcopy
        System.out.println(solu.findJudge(2,testArr));
    }
}
