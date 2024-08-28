package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Najmiddin", 21, "Dzialdowska 8a");
        s.setX(15);

        String filename = "src\\Serialization\\text.dat";
        FileOutputStream fileOut = null;
        ObjectOutputStream objectOut = null;

        // Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(s);

            fileOut.close();
            objectOut.close();
            System.out.println("Object has been serialized:\n" + s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {
            fileIn = new FileInputStream(filename);
            objectIn = new ObjectInputStream(fileIn);
            Student object = (Student) objectIn.readObject();
            System.out.println("Object has been deserialized\n" + object);
            objectIn.close();
            fileIn.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
