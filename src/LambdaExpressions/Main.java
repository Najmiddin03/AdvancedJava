package LambdaExpressions;

import java.util.*;
import java.util.function.IntPredicate;

interface Lambda {
    void demo();
}

class Data {
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        Lambda for functional interface
        Lambda lambda = () -> System.out.println("Statement");
        lambda.demo();

//        Lambda for Threads
        Thread thread1 = new Thread(() -> System.out.println("Hello world"));
        Thread thread2 = new Thread(() -> {
            System.out.println("Hey");
            System.out.println("Hey");
        });
        thread1.start();
        thread2.start();

//        Using comparator with lambda
        List<Data> list = new ArrayList<>();
        list.add(new Data("Najmiddin"));
        list.add(new Data("Adham"));
        list.add(new Data("Asad"));
        list.add(new Data("Asadullo"));
        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Data data : list) {
            System.out.println(data);
        }
        System.out.println("***************************");
        list.sort(((o1, o2) -> {
            if (o1.getName().length() < o2.getName().length()) {
                return -1;
            } else if (o1.getName().length() > o2.getName().length()) {
                return 1;
            } else {
                return 0;
            }
        }));
        for (Data data : list) {
            System.out.println(data);
        }

//        Lambda for forEach loop
        List<Integer> list1 = Arrays.asList(1, 5, 6, 25, 284, 8, 5, 58, 45, 8, 6);
        list1.forEach(i -> System.out.println(i));

//        Predicates overview with lambda
        IntPredicate lessThan10 = value -> value < 10;
        System.out.println(lessThan10.test(100));
        System.out.println(lessThan10.test(9));
    }
}