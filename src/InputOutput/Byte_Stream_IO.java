package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_Stream_IO {


    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            inStream = new FileInputStream("D:\\JavaLearning\\AdvancedJava\\src\\InputOutput\\source.txt");
            outStream = new FileOutputStream("D:\\JavaLearning\\AdvancedJava\\src\\InputOutput\\test.txt");
            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inStream != null) {
                inStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }
    }
}
