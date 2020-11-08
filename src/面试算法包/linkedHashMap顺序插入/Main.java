package 面试算法包.linkedHashMap顺序插入;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = codeChar("caabbcc");
        System.out.println(s);
    }

    static String codeChar(String s) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        for (char cur : charArray) {
            //判断当前的hashmap里面有没有
            if (linkedHashMap.containsKey(cur)) {
                int tempValue = linkedHashMap.get(cur);
                linkedHashMap.put(cur, ++tempValue);
            } else {
                linkedHashMap.put(cur, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = linkedHashMap.entrySet();
        StringBuilder res = new StringBuilder();
        for (Map.Entry entry : entries
                ) {
            res.append(entry.getKey());
            res.append(entry.getValue().toString());
        }
        return res.toString();
    }
}

