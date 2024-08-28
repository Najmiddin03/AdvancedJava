package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScannerClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("src\\InputOutput\\source.txt"))) {
            String line;
            while (sc.hasNext()) {
                line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
