package 자판기만들기;
// 사용자가 메뉴 번호를 입력하면 해당하는 커피와 가격을 출력하는 자판기 프로그램을 작성하세요
//      메뉴
//      1 -> 아메리카노 (1500)
//      2 -> 카페라떼
//      3 -> 카푸치노
//      4 -> 아이스티

import java.util.Scanner;

// 1. 사용자가 메뉴 번호(1~4)를 입력 받습니다.
// 2. switch 문을 사용하여, 해당 음료와 가격을 출력
// 3. 메뉴 번호가 1 ~ 4가 아니면, "해당 메뉴가 없습니다" 출력
public class CoinMain {
    public static void main(String[] args) {
        // 메뉴 만들기
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴");
        System.out.println("1. -> 아메리카노(1500원)");
        System.out.println("2. -> 카페라떼(2000원)");
        System.out.println("3. -> 카푸치노(2500원)");
        System.out.println("4. -> 아이스티(1800원)");
        System.out.println("메뉴 번호를 입력하세요 : ");


        // 사용자 메뉴 입력 받기
        int sum = sc.nextInt();

        // SWITCH 문 사용
        switch (sum){
            case 1:
                System.out.println("아메리카노(1500원)");
                break;
            case 2:
                System.out.println("카페라떼(2000원)");
                break;
            case 3:
                System.out.println("카푸치노(2500원)");
                break;
            case 4:
                System.out.println("아이스티(1800원)");
                break;
            default:
                System.out.println("해당 메뉴가 없습니다");
                break;
        }
        sc.close();

    }
}
