package 阿_模板包.文本阅读模板;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBaseModel {
    public void readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        int count = 0;
        while ((line =br.readLine()) != null) {
            System.out.println(line);
            count++;
        }
        System.out.println(count);
    }
}


class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("src/草稿/testfile.txt");
        new FileReaderBaseModel().readFile(file);
    }
}

