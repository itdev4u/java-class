package ch05;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k =1 ;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for(int i = 0; i < 5; i++) {
            System.out.printf("score[%d] : %d%n", i, score[i]);
        }
        System.out.println("===================");
        int cnt = 0;
        for(int i : score) {
            System.out.printf("score[%d] : %d%n", cnt++, i);
        }
        System.out.println("===================");
        System.out.printf("tmp:%d%n", tmp);

        // Index Out of bounds
        System.out.println("score[7] : " + score[7]);
    }
}
