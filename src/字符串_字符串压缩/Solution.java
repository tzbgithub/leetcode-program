package 字符串_字符串压缩;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
//https://leetcode-cn.com/problems/compress-string-lcci/solution/zi-fu-chuan-ya-suo-by-leetcode-solution/

 字符串的核心：选择合适的容器存储和操作字符串 stringbuilder性能最佳
 */
class Solution {
    public String compressString(String S) {
        if(S.length()==0)
            return S;
        char[] charArr = S.toCharArray();
        char curC = charArr[0];
        int count=1;
        StringBuffer sb = new StringBuffer();

        for(int i = 1;i<charArr.length;i++){
            if(charArr[i] != curC){
                //将之前的两个维护变量传入Stringbuffer
                sb.append(curC);
                sb.append(Integer.toString(count));
                //curC换值，计数重置
                curC = charArr[i];
                count=0;
            }
            count++;
        }
        //最后一段添加：需要以后面进行对比是否相同的要进行边界处理
        sb.append(curC);
        sb.append(Integer.toString(count));

        //判断解码长度
        if(sb.toString().length()>=charArr.length){
            return S;
        }
        else{
            return sb.toString();
        }

    }


    static class Test {
        public static void main(String[] args) throws IOException {
            System.out.println("请输入需要解码的字符串");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            System.out.println(new Solution().compressString(s));
        }
    }
}