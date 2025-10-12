package lambda;

import java.util.Arrays;
import java.util.List;

public class LamdaReduceEx {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("junggun", "minji", "jungryul", "michel", "john", "steve", "jordan", "hulk");
        String longElement1 = "";
        for(String name : names) {
            if("a".length() <= name.length()
                && longElement1.length() <= name.length()) {
                longElement1 = name;
            }
        }
        System.out.println("longElement1: " + longElement1);
        System.out.println("lamda statement");
        String longElement2 = names.stream()
                .reduce("a", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        System.out.println("longElement2: " + longElement2);
    }
}
