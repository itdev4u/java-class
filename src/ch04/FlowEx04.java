package ch04;

import java.util.Scanner;

public class FlowEx04 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요. > ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        /*
        if문으로 구현한다면
        if(score >= 90) {
            grade = 'A';
        }
        if(score >= 80 && score < 90) {
            grade = 'B';
        }
        if(score >= 70 && score < 80) {
            grade = 'C';
        }
        if(score < 70) {
            grade = 'D';
        }
        */
        System.out.println("당신의 점수는 " + score + "점이며 학점은 " + grade + "입니다.");
    }
}
