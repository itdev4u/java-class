package ch04;

public class LoopEx02 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
            System.out.printf("1부터 %2d까지의 함 : %2d%n", i, sum);
        }
    }
}
