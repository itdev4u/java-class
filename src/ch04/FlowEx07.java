package ch04;

import java.util.Scanner;

public class FlowEx07 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. > ");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) + 1; //1,2,3중 하나가 나옴
        System.out.println("user : " + user);
        System.out.println("com : " + com);
        System.out.println("user-com : " + (user - com));

        switch(user - com) {
            case 2: case -1:
                System.out.println("졌습니다.");
                break;
            case 1: case -2:
                System.out.println("이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
        }
    }
}