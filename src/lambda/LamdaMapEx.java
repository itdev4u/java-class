package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaMapEx {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("junggun", "minji", "jungryul", "michel", "john", "steve", "jordan", "hulk");

        System.out.println("for statement");
        for(String name :  names) {
            System.out.println(name.toUpperCase());
        }

        System.out.println("lamda statement");
        names.stream()
                .map(name -> name.toUpperCase())
                //.forEach(System.out::println);
                .forEach(name -> System.out.println(name));
    }
}