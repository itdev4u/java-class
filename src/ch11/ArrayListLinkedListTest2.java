package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("= 접근시간 테스트 =");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));
    }

    private static void add(List list) {
        for(int i = 0; i < 1000000; i++)
            list.add(i + "");
    }

    private static long access(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++)
            list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
