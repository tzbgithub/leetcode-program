package 面试算法包.报数;

public class Main {
    public static void main(String[] args) {
        System.out.println(baoshu(10, 3));
    }

    static int baoshu(int n, int m) {
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        return  (baoshu(n - 1, m) + m) % n;
    }

}

