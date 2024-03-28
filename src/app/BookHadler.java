package app;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;


public class BookHadler {

    public static void main(String[] args)
            throws NoSuchMethodException, SecurityException {
        Class<ProductInfo> infoClass = ProductInfo.class;
        getAnnot(infoClass);
        Method method = infoClass.getMethod("getData");
        getAnnot(method);
    }

    static void getAnnot(AnnotatedElement element) {
        try {
            System.out.println("\nAnnotation on " + element.getClass().getName());

            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if ( annotation instanceof Product product ) {
                    System.out.println("Name: " + product.name());
                    System.out.println("quota: " + product.quota());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}