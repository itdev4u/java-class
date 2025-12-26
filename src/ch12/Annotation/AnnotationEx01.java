package ch12.Annotation;

public class AnnotationEx01 {
}

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    void parentMethod() { }
}
