package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LamdaEx04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        list.removeIf(x -> x%2 == 0 || x%3 == 0);
        System.out.println(list);

        list.replaceAll(x -> x*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "} "));
        System.out.println();
    }
}
