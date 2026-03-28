package prac;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        //하나의 정수를 입력받고, 해당 정수가 홀수인지 짝수인지 판별하기
        //반복문으로 계속 입력받고 판별할 수 있게 하고, 정수 입력에 있어 -1을 입력 시 프로그램 종료가 되도록 하기

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            if (num % 2 == 0) {
                System.out.println("입력한 숫자 " + num + "은 짝수입니다.");
            } else {
                System.out.println("입력한 숫자 " + num + "은 홀수입니다.");
            }
        }

        sc.close();

        /* [실행 결과 예시]
        정수 입력 받기 : 5
        입력한 숫자 5은 홀수입니다.
        정수 입력 받기 : 10
        입력한 숫자 10은 짝수입니다.
        정수 입력 받기 : -1
        프로그램 종료
         */
    }
}
