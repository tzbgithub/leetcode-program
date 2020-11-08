package 阿_模板包.回溯模板;


import java.util.LinkedList;
import java.util.List;

/**
 * 回溯模板
 *  1 一直不变的变量，可以放在函数外面，成为类的成员
 *  2 变化的变量放在递归函数里面，因为这个变化的变量一般就是变量，需要回溯的
 *  3 一旦trace的数量发生了改变，等同于递归函数的状态变量发生了改变，然后这个改变会导致接下来的两个操作
 *      a) 将这个trace的添加导致的某个变量传给递归函数 = 进入下一个状态流程
 *      b) a)指令执行完后，要删除trace中的添加操作
 */

class Main {
    List<String> res = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        //第一步，根据函数的返回结果创建res
        //第二步，更具res中类型创建trace，trace应该具有可以自动扩容的特点
        StringBuilder trace = new StringBuilder();
        //第三步：根据每一层需要的元素
        backtrace(trace,0,0,n);

        return res;
    }

    private void backtrace(StringBuilder trace, int leftCount, int rightCount, int max) {
        //终止条件
        if (trace.length() == 2 * max) {
            res.add(trace.toString());
            return;
        }
        //添加左边括号的条件:左边括号的数量还没达到要求
        if (leftCount < max) {
            trace.append('(');
            //添加后左边括号数量上的状态发生改变，所以递归到下一层，就是左边括号的数量+1
            //只要数量的状态发生改变，就要进行一次递归，然后再回溯
            backtrace(trace, leftCount + 1, rightCount, max);
            trace.deleteCharAt(trace.length() - 1);
        }
        //(有效括号）放右边括号的前提：如果右边的括号小于左边的括号
        if (rightCount < leftCount) {
            trace.append(')');
            backtrace(trace, leftCount, rightCount + 1, max);
            trace.deleteCharAt(trace.length() - 1);
        }
    }
}


class Test2 {
    public static void main(String[] args) {
        System.out.println(new Main().generateParenthesis(3));
    }
}