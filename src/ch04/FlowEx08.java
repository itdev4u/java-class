package ch04;

import java.util.Scanner;

public class FlowEx08 {
    public static void main(String[] args) {
        System.out.print("주민번호를 입력하세요.(011111-1234567) > ");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);
        switch (gender) {
            case '1': case '3':
                System.out.println("남자입니다.");
                break;
            case '2': case '4':
                System.out.println("여자입니다.");
                break;
            default :
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}
