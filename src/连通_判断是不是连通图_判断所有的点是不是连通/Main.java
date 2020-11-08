package 连通_判断是不是连通图_判断所有的点是不是连通;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] root = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                root[i] = -1;
            }
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                union(x, y, root);
            }
            int count = 0;
            for (int i = 1; i < n + 1; i++) {
                if (root[i] == -1) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }

    public static void union(int x, int y, int[] root) {
        int rootX = findRoot(x, root);
        int rootY = findRoot(y, root);
        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    }

    public static int findRoot(int x, int[] root) {
        if (root[x] == -1) {
            return x;
        }
        root[x] = findRoot(root[x], root);
        return root[x];
    }
}