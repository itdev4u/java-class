package ch12.Annotation;

public class AnnotationEx02 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        System.out.println(nc.getOldField());
    }
}
