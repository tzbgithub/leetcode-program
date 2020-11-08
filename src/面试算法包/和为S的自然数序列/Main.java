package 面试算法包.和为S的自然数序列;

import java.lang.reflect.Method;
import java.util.*;
//正整数序列，然后求所有和为S的组合


public class Main {
    public static String[] method(String s){
        char[] array = s.toCharArray();
        int n = array.length;
        Integer max = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            String s1 = String.valueOf(array[i]);
            String s2 = String.valueOf(array[i + 1]);
            String s3 = s1 + s2;
            if (!map.containsKey(s3)) {
                map.put(s3, 1);
            } else {
                int count = map.get(s3) + 1;
                max = max > count ? max : count;
                map.put(s3, count);
            }
        }
        List<String> res = new ArrayList<>();
        for(Map.Entry entry:map.entrySet()){
            if (entry.getValue() == max) {
                res.add((String) entry.getKey());
            }
        }
        int size = res.size();
        String[] resEnd = new String[size];
        for (int i = 0; i < size; i++) {
            resEnd[i] = res.get(i);
        }
        return resEnd;
    }
}

class Test {
    public static void main(String[] args) {
        String[] method = Main.method("abcd");
        for (String s:
             method) {
            System.out.println(s);
        }
    }
}

