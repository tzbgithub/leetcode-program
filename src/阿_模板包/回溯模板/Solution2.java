package 阿_模板包.回溯模板;

import java.util.LinkedList;
import java.util.List;

/**
 * 回溯模板
 * 1 一直不变的变量，可以放在函数外面，成为类的成员
 * 2 变化的变量放在递归函数里面，因为这个变化的变量一般就是变量，需要回溯的
 * 3 一旦trace的数量发生了改变，等同于递归函数的状态变量发生了改变，然后这个改变会导致接下来的两个操作
 * a) 将这个trace的添加导致的某个变量传给递归函数 = 进入下一个状态流程
 * b) a)指令执行完后，要删除trace中的添加操作
 * 4 关于trace.add
 * //如果add的对象是在同一个位置上不同可能性，而且这些不同可能性是同等地位的（独立相互没有制约），就要用for,
 *      而且一般同一个位置的可能性的情况存储是数组，注意这个数组不是可选列表（只是for循环），可选列表是递归函数中的变量
 * //如果add的对象是前后关系 = 用递归函数：就是状态不同的递归
 */
class Solution2 {
    List<String> res = new LinkedList<>();

    public List<String> letterCombinations(String digits) {
        StringBuilder trace = new StringBuilder();
        backtrace(trace, digits);
        return res;
    }

    private void backtrace(StringBuilder trace, String digits) {
        //如果可选列表==0，递归结束（digits每一层递归条件是不同，作为不同的状态）
        if (digits.length() == 0) {
            res.add(trace.toString());
            return;
        }

        //下一步是trace.add,
        //  如果add的对象是在同一个位置上不同可能性，就要用for,
        //      而且一般同一个位置的可能性的情况存储是数组，注意这个数组不是可选列表（只是for循环），可选列表是递归函数中的变量
        //  如果add的对象是前后关系 = 用递归函数： 就是状态不同的递归
        for (char c : getChars(digits.charAt(0))) {
            trace.append(c);
            backtrace(trace, digits.substring(1, digits.length()));
            trace.deleteCharAt(trace.length() - 1);
        }
    }

    private char[] getChars(char c) {
        switch (c) {
            case '2':
                return new char[]{'a', 'b', 'c'};
            case '3':
                return new char[]{'d', 'e', 'f'};
            case '4':
                return new char[]{'g', 'h', 'i'};
            case '5':
                return new char[]{'j', 'k', 'l'};
            case '6':
                return new char[]{'m', 'n', 'o'};
            case '7':
                return new char[]{'p', 'q', 'r', 's'};
            case '8':
                return new char[]{'t', 'u', 'v'};
            case '9':
                return new char[]{'w', 'x', 'y', 'z'};
            default:
                return new char[0];
        }
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Solution2().letterCombinations("23"));
    }
}
