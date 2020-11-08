package 错误log记录;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<String, Integer>();


        String path = in.next();

        while (in.hasNextLine()) {

            String[] arr = path.split("\\\\");

//	System.out.println(arr[arr.length-1]);

            String fileName = arr[arr.length - 1];

            if (fileName.length() > 16) {
                fileName.substring(16);

            }

            String lineNum = in.next();


//	System.out.println(lineNum);


            String fileNameLineNum = fileName + "_" + lineNum;



            if (map.get(fileNameLineNum) == null) {
                map.put(fileNameLineNum, 1);
            } else {
                int count = map.get(fileNameLineNum);
                count++;
                map.put(fileNameLineNum, count);
            }

        }

        List<Map.Entry<String, Integer>> sortList = sortHashMap(map);


        if (sortList.size() > 8) {
            for (int i = 0; i < 8; i++) {


                String sortFileNameLineNum = sortList.get(i).getKey();
                String[] StringArr = sortFileNameLineNum.split("_");
                String filename = StringArr[0];
                String linenum = StringArr[1];

                int errorCount = sortList.get(i).getValue();

                System.out.println(filename + " " + linenum + " " + errorCount);
            }
        } else {
            for (int i = 0; i < sortList.size(); i++) {

                String sortFileNameLineNum = sortList.get(i).getKey();
                String[] StringArr = sortFileNameLineNum.split("_");
                String filename = StringArr[0];
                String linenum = StringArr[1];

                int errorCount = sortList.get(i).getValue();

                System.out.println(filename + " " + linenum + " " + errorCount);
            }

        }
    }


    public static List<Map.Entry<String, Integer>> sortHashMap(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                //return o1.getValue().compareTo(o2.getValue());
                return o2.getValue().compareTo(o1.getValue());
            }
        });


//		for (Map.Entry<String, Integer> mapping : list) {
//			System.out.println(mapping.getKey() + ":" + mapping.getValue());
//		}

        return list;
    }
}
