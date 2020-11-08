package 计算_四则运算;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://leetcode-cn.com/problems/basic-calculator-ii/submissions/
class Solution {
    public int calculate(String s) {
        char sign = '+';//初始为+
        int res =0,d=0;
        Stack<Integer> numStack = new Stack<Integer>();
        for(int i =0;i<s.length();i++){
            //当前是数字、
            if(s.charAt(i)>='0'){
                //计算数字字符并列的数值
                d = d*10-'0' + s.charAt(i);
            }
            //如果是符号，则看之前的符号标记是什么，细分，如果是加减就将数字压入栈中，如果是乘除，先乘除结束得到备份变量，然后再压入栈中
            if((s.charAt(i) <'0' && s.charAt(i) != ' ') || i == s.length()-1){
                if(sign == '+'){
                    numStack.push(d);
                }
                else if(sign =='-'){
                    numStack.push(-d);
                }
                else if(sign == '*' || sign =='/' ){
                    //第一个乘法符号之前的数字因为前面是加减，所以第一个乘法元素肯定入栈，如果前面的符号是乘法，就要将当前栈顶乘以当前d变量，然后弹栈，再将乘积结果入栈
                    int tmp = sign=='*'? numStack.peek()*d : numStack.peek()/d;
                    numStack.pop();
                    numStack.push(tmp);
                }
                sign = s.charAt(i);
                d = 0;
            }
        }

        while(!numStack.isEmpty()){
            res += numStack.pop();

        }
        return res;
    }
}


//test
class Test {
    public static void main(String[] args) throws IOException {
        Solution solu = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(solu.calculate(s));


        reader.close();

    }

}
