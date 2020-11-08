package 字符串_有效括号;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/solution/
 * 括号判断，就是过滤符号，然后左边入栈，保存状态，检测到右边括号的时候出栈，判断
 */

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n==0)
            return true;
        Deque<Character> stack = new LinkedList<Character>();
        char[] charArr = s.toCharArray();
        for(int i =0;i<n;i++){
            if(charArr[i] == '(' || charArr[i] == '{'|| charArr[i] == '[' ){
                stack.push(charArr[i]);
            }
            if(!stack.isEmpty()){
                if(charArr[i] == ')' || charArr[i] == '}'|| charArr[i] == ']'){
                    if(charArr[i] == ')'){
                        if(stack.peek()!='(')
                            return false;
                        stack.pop();
                    }
                    else if(charArr[i] == '}'){
                        if(stack.peek()!='{')
                            return false;
                        stack.pop();
                    }
                    else if(charArr[i] == ']'){
                        if(stack.peek()!='[')
                            return false;
                        stack.pop();
                    }
                }
            }
            else
                return false;
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
