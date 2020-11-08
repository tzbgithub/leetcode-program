package 字符过滤_过滤除了数字和字母;

//过滤出数字和字符
//判断回文
public class Main{
    public boolean isPalindrome(String s) {

        //过滤
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            //是字符添加到sb
            if (Character.isLetterOrDigit(charArray[i])) {
                sb.append(charArray[i]);
            }
        }
        return isHuiWen(sb);

    }

    public boolean isHuiWen(StringBuilder s1){
        String s = s1.toString().toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().isPalindrome("1Ab,a1")) ;
    }
}