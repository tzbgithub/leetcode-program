package hashmap排序;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String args[]) {

        Map<String, Long> map = new HashMap<String, Long>();
        map.put("c", 33333L);
        map.put("a", 11111L);
        map.put("d", 44444L);
        map.put("e", 55555L);
        map.put("b", 22222L);


        List<Map.Entry<String, Long>> list = new ArrayList<Map.Entry<String, Long>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {

            @Override
            public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
                //return o1.getValue().compareTo(o2.getValue());
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Long> mapping : list) {
            System.out.println(mapping.getKey() + ":" + mapping.getValue());


        }
    }

}
