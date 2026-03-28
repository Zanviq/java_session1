package prac;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        //이름과 나이를 입력받고 출력하기

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");

        sc.close();







        /* [실행 결과 예시]
        당신의 이름을 입력 : 최서구
        당신의 나이를 입력 : 25
        당신의 이름은 최서구이고, 나이는 25살 입니다.
         */
    }
}
