package 最近缓存算法LRU;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cacheSize = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(cacheSize);
        Stack<Integer> recentStack = new Stack<Integer>();
        while (in.hasNextLine()) {
            String operateS = in.next();
            if (operateS.equals("p")) {
                int key = in.nextInt();
                int value = in.nextInt();
                if ((!map.containsKey(key)) && (map.size() == cacheSize)) {
                    int last = recentStack.firstElement();
                    map.remove(last);
                    map.put(key, value);
                    recentStack.remove(0);
                    recentStack.push(key);

                } else {
                    map.put(key, value);
                    recentStack.push(key);
                }

            }
            else {

                int key = in.nextInt();

                if (map.get(key) != null) {
                    int value = map.get(key);
                    System.out.println(value);

                    recentStack.removeElement(key);
                    recentStack.push(key);
                } else {
                    System.out.println(-1);
                }
            }
        }

    }
}
