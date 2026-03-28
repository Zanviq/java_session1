package prac;
import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        //입력할 숫자의 개수를 입력받고, 해당 숫자만큼 수를 입력하여 입력한 정수의 합계와 평균을 구하자.
        //합계와 평균을 구하는 메서드를 만들어서 해보자. (하단 sum, avg 메서드를 완성해서)

        Scanner sc = new Scanner(System.in);

        System.out.print("개수: ");
        int count = sc.nextInt();

        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("합계: " + sum(nums));
        System.out.println("평균: " + avg(nums, sum(nums)));

        sc.close();

        /* [실행 결과 예시]
        입력할 숫자 개수: 4
        1
        2
        3
        4
        입력한 숫자 합계: 10
        입력한 숫자 평균: 2.5
         */
    }

    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static double avg(int[] nums, int sum) {
        return (double) sum / nums.length;
    }
}
