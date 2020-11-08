package 排序_第三大数;


import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int hatNum = in.nextInt();

        int[] hatPrice = new int[hatNum];
        for (int i = 0; i < hatNum; i++) {
            hatPrice[i] = in.nextInt();
        }


        int a = thirdMax(hatPrice);
        System.out.println(a);

    }


    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ((queue.size() < 3 || nums[i] > queue.peek()) && !queue.contains(nums[i])) {
                queue.offer(nums[i]);
            }
            if (queue.size() > 3) {
                queue.poll();
            }
            max = Math.max(max, nums[i]);
        }
        return queue.size() < 3 ? max : queue.peek();
    }


}
