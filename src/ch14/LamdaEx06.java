package ch14;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LamdaEx06 {
    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random() * 100) + 1;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i % 2 == 0;
        IntUnaryOperator op = i -> i/10 * 10;

        
    }
}
