package 连通_判断是不是连通图_判断所有的点是不是连通;

import java.util.*;

public class Main2 {
    public void problem15() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int m = input.nextInt();
            if (n == 0 || n == 1) {
                System.out.println("YES");
                break;
            }
            if (m == 0) {
                System.out.println("NO");
                break;
            }
            Set<Integer> set = new HashSet<>();
            set.add(input.nextInt());
            set.add(input.nextInt());
            int a, b;
            for (int i = 0; i < m - 1; i++) {
                a = input.nextInt();
                b = input.nextInt();
                if (set.contains(a) || set.contains(b)) {
                    set.add(a);
                    set.add(b);
                }
            }
            if (set.size() == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        new Main2().problem15();
    }
}

