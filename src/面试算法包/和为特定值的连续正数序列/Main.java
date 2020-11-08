package 面试算法包.和为特定值的连续正数序列;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<List<Integer>> res = new ArrayList<>();

    List<List<Integer>> findContinusSequence(int sum) {
        int start = 1;
        int end = 2;
        int curSum = 3;
        while (end < sum) {
            if (curSum < sum) {
                end++;
                curSum += end;
            } else if (curSum > sum) {
                curSum -= start;
                start++;
            } else {
                List<Integer> list = new ArrayList<>();
                for (int i = start; i <= end ; i++) {
                    list.add(i);
                }
                res.add(list);
                curSum -= start;
                start++;
                end++;
                curSum += end;
            }
        }
        return res;
    }


}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().findContinusSequence(100));
    }
}

