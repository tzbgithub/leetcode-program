package 阿_模板包.去重排序;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Create by zhatang on 2020/7/25.
 */
public class Main {
    //同理可以添加字符 和 数字
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        set.add("ac");
        set.add("c");
        set.add("ab");
        set.add("b");
        set.add("a");

        Object[] array = set.toArray();
        ArrayList<Object> list = new ArrayList<>(set);
        System.out.println(list.toString());
    }
}
