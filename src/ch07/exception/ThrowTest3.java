package ch07.exception;

import java.util.Scanner;

public class ThrowTest3 {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("음수를 제외한 숫자만 입력하세요 : ");
            int num = scn.nextInt();
            if(num < 0) {
                throw new ArithmeticException("왜 하지말라는 짓을 하는지...");
            }
            System.out.println("음수를 입력하지는 않으셨군요. 감사합니다.");
        } catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
