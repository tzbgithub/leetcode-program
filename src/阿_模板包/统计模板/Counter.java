package 阿_模板包.统计模板;

import java.util.HashMap;

/**
 * Create by zhatang on 2020/7/27.
 * 统计任何出现过的次数
 */
public class Counter {

    public int count(String s) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }
        //此时map中存着出现对应对象的次数，记得遍历map一般用原来的容器来遍历元素
//        for (int i = 0; i < n; i++) {
//            Integer integer = map.get(charArray[i]);
//        }
        return -1;
    }
}
