package 阿_模板包.io测试模板;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test {
    public static void main(String[] args) throws IOException {
        Solution solu = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        solu.method();
        
        
        reader.close();
        
    }
    
}
