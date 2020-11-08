package 面试算法包.字符串排列;

import java.util.LinkedList;
import java.util.List;

/**
 * Create by zhatang on 2020/9/27.
 */
public class Main {
    String[] quanPaiLie(char[] arr) {
        List<String> res = new LinkedList<>();
        StringBuilder trace = new StringBuilder();
        backtrace(trace, res, arr);
        return (String[]) res.toArray();
    }

    private void backtrace(StringBuilder trace, List<String> res, char[] arr) {
        if (trace.length() == arr.length) {
            res.add(trace.toString());
        }

        for (int i = 0; i < arr.length; i++) {

        }
    }
}
