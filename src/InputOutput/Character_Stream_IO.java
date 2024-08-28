package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;

public class Character_Stream_IO {
    public static void main(String[] args) throws Exception {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("src\\InputOutput\\source.txt");
            writer = new FileWriter("src\\InputOutput\\test.txt");
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
