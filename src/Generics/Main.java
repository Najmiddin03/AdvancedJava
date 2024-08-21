package Generics;

public class Main {
    public static void main(String[] args) {
        GenericHolder<Integer> iObj = new GenericHolder<>(15);
        System.out.println(iObj.getObj());
        GenericHolder<String> sObj = new GenericHolder<>("Hello world");
        System.out.println(sObj.getObj());
        DualGenericHolder<Integer, String> dObj = new DualGenericHolder<>(15, "Hello world");
        dObj.display();
    }
}
