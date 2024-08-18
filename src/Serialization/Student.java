package Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String name;
    private int age;
    private String address;

    // This keyword will allow variable to not get serialized
    transient int x;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Student name: " + this.getName() + '\n' +
                "Age: " + this.getAge() + '\n' +
                "Address: " + this.getAddress() + '\n' +
                "X: " + this.getX();
    }
}
