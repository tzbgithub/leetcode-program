package 图_遍历_总距离;


import java.util.*;

public class Main {

    private static List<Integer>[] path = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        path = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++)
            path[i] = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a].add(b);
            path[b].add(a);
        }
        int depth = -1;
        int crr = 0;
        int size = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[n + 1];
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            depth++;
            size = queue.size();
            while (size-- > 0) {
                crr = queue.poll();
                for (int val : path[crr]) {
                    if (visited[val])
                        continue;
                    visited[val] = true;
                    queue.add(val);
                }
            }
        }
        int res = 2 * (n - 1) - depth;
        System.out.println(res);
    }
}