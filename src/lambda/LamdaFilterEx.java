package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaFilterEx {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("junggun", "minji", "jungryul", "michel", "john", "steve", "jordan", "hulk");
        List<String> startWithS = new ArrayList<String>();
        for(String name : names) {
            if(name.startsWith("s")) {
                startWithS.add(name);
            }
        }
        System.out.println("startWithS: " + startWithS);
        System.out.println("lamda statement");
        List<String> startWithS2 = names.stream()
                .filter(name -> name.startsWith("s"))
                .collect(Collectors.toList());
        System.out.println("startWithS2: " + startWithS2);
    }
}
