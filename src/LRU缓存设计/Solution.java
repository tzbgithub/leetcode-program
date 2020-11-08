package LRU缓存设计;

import java.io.IOException;
import java.util.*;

public class Solution {
    /**
     * lru design
     *
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    List<Integer> res = new LinkedList<>();
    int k;
    Deque<Integer> priorStack = new LinkedList<>();
    Map<Integer,Integer> cache = new HashMap<>();

    public int[] LRU (int[][] operators, int k) {
        this.k = k;
        //如果是1，调用set
        //如果是2，调用get方法
        for (int[] content:
        operators){
            if (content[0] == 1) {
                set(content);
            }
            if (content[0] == 2) {
                res.add(getRes(content[1]));
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void set(int[] content) {
        //往cache查询
        int key = content[1];
        int value = content[2];
        if (cache.containsKey(key)) {
            cache.put(key, value);
        } else {
            //满了
            if (cache.size() < k) {
                cache.put(key, value);
            }
            else{
                Integer deletedKey = priorStack.removeLast();
//                System.out.println(deletedKey);
                cache.remove(deletedKey);
                cache.put(key, value);
            }
        }
        priorStack.push(key);
    }

    private int getRes(int i) {
        if (cache.containsKey(i)) {
            priorStack.remove(i);
            priorStack.push(i);
            return cache.get(i);
        } else {
            return -1;
        }
    }
}

class Test {
    //数组第一个元素 表示set
    //数组第二个元素 表示get
    public static void main(String[] args) throws IOException {
        int[] lru = new Solution().LRU(new int[][]{{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}}, 3);
        for (int i:
        lru){
            System.out.println(i);
        }
    }
    }

