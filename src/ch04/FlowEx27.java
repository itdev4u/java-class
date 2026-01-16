package ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("합계를 구할 수를 입력하세요(종료시 0) : ");
        while(flag){
            System.out.print(" >> ");
            num = input.nextInt();
            if(num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계는 : " + sum);
    }
}
