package prac;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        //앞에 공백 있이 오름차순으로 별 출력하기

        Scanner sc = new Scanner(System.in);
        System.out.print("줄 개수: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

        /* [실행 결과 예시]
        출력할 줄 개수 입력: 5
            *
           **
          ***
         ****
        *****
         */
    }
}
