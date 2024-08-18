package Annotation;

import java.lang.reflect.Method;

public class Main {
    @CustomAnnotation(15)
    public void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws Exception {
        Main m=new Main();
        Method methodVal=m.getClass().getMethod("hello");

        CustomAnnotation customAnnotation=methodVal.getAnnotation(CustomAnnotation.class);
        System.out.println("Value is: "+customAnnotation.value());
    }
}
