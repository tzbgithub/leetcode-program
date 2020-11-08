package 阿_模板包;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    public int method(int[] arr) {
        return 0;
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] testArr = {};//testcopy
        System.out.println(solu.method(testArr));
    }
}


class Test {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.getLast());
    }
}