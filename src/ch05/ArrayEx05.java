package ch05;

public class ArrayEx05 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0;

        int[] score = { 100, 88, 100, 100, 90 };

        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
