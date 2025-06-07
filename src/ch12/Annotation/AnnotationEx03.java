package ch12.Annotation;

import java.util.ArrayList;

public class AnnotationEx03 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        System.out.println(nc.oldField);

        @SuppressWarnings("unchecked")
        ArrayList<NewClass> list = new ArrayList();
        list.add(nc);
    }
}
