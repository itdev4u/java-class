package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class LamdaCollectEx {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("junggun", "minji", "jungryul", "michel", "john", "steve", "jordan", "hulk");
        for(int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + ", ");
        }
        if(names.size() > 0) {
            System.out.println(names.get(names.size()-1));
        }
        System.out.println("lamda statement");
        System.out.println(
                names.stream()
                        .collect(joining(", "))
        );
    }
}
