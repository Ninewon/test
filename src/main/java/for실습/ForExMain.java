package for실습;

import java.util.Scanner;

// 입력 받은 수의 짝수의 합 구하기
public class ForExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 합을 저장할 변수 생성 (초기화 필요)
        System.out.print("시작 숫자를 입력: ");
        int total = 0;
        // 범위 기반 반복문 생성
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            if (i % 2 ==0) {
                total += 1;
            }
            System.out.println(num + "부터 1까지의 짝수 합계" + total);
        }
        sc.close();


        // 실습 문제 2번
        // 입력 받은 수의 범위 내의 5의 배수를 출력 하기, 한줄에 10개 씩 출력


        //실습 문제 3번
        // 정수를 입력 받아 입력받은 정수 * 정수 크기의 행렬을 출력하는 프로그램 작성
        // 입력 : 4
        //  1  2  3  4
        //  5  6  7  8
        //  9 10 11 12
        // 13 14 15 16

        System.out.print("정수 입력: ");
        int a = sc.nextInt();

        int number = 1;
        System.out.println("입력" + a);
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                System.out.printf("3%d", number);
                number++;
            }
            System.out.println();
        }

    }
}
