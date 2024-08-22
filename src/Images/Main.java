package Images;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int width = 963;
        int height = 640;
        BufferedImage image = null;
        image = readFromFile(width, height, image);
        writeToFile(image);

    }

    private static void writeToFile(BufferedImage image) {
        try {
            File output = new File("D:\\JavaLearning\\AdvancedJava\\src\\Images\\output.jpg");
            ImageIO.write(image, "jpg", output);
            System.out.println("Writing complete");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {
            File sampleFile = new File("D:\\JavaLearning\\AdvancedJava\\src\\Images\\image.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(sampleFile);
            System.out.println("Reading complete" + image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }
}
