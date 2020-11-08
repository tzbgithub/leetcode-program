package 统计一个文本的单词个数;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class T {
    /**
     *
     * @throws FileNotFoundException
     */
    public static String filename = "src/test.txt";
    public static StringBuffer sb = null;

    public static void wordCounter() throws FileNotFoundException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(filename)));
            String inputLine = null;
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();

            while ((inputLine = br.readLine()) != null) {
                String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");
                for (int i = 0; i < words.length; i++) {
                    String key = words[i].toLowerCase();
                    if (key.length() > 0) {
                        if (map.get(key) == null) {
                            map.put(key, 1);
                        } else {
                            int times = map.get(key).intValue();
                            times++;
                            map.put(key, times);
                        }
                    }
                }
            }
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
