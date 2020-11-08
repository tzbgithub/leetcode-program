package 字符串_生成括号;

import java.util.ArrayList;
import java.util.List;

/**
 暴力解法
 1 递归生成括号
 2 判断括号是不是相同的

 https://leetcode-cn.com/problems/generate-parentheses/solution/
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        //创建判断后字符的容器
        List<String> res = new ArrayList<>();
        //创建生成所有字符的数组，因为递归的深度 = 数组的长度
        char[] combination = new char[2*n];
        //生成所有字符并且判断的函数
        generateRes(combination,res,0);
        return res;
    }

    public void generateRes(char[] combination,List<String>res,int positon){
        if(positon == combination.length){
            if(isVaild(combination)){
                res.add(new String(combination));
            }
        }
        else{
            //生成括号
            combination[positon] = '(';
            generateRes(combination,res,positon+1);
            combination[positon] = ')';
            generateRes(combination,res,positon+1);

        }
    }

    public boolean isVaild(char[] combination){
        int banlance = 0;
        for(char c:combination){
            if(c=='(')
                banlance++;
            else if(c==')')
                banlance--;
            //特殊情况，一开始就没有左边括号的，只有右边括号的
            if(banlance<0)
                return false;
        }
        if(banlance==0){
            return true;
        }
        else{
            return false;
        }
    }
}
