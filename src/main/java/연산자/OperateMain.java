package 연산자;

import java.util.Scanner;

// 연잔사은 프로그램에서 변수의 값을 계산하는 비교하는 역하
// 산술연산자 : +,-*,/,%
// 대입연산자 : =,+=,-=,/=,%=
// 증감연산자 : ++, --
// 비교연산자 : >,<,>=,<=,!=
// 논리연산자 : \\(or 연산자), &&(and 연산자), !(부정의 연산자)
// 상황연산자 : 조전식 ? 참인경우 : 거짓인 경우
// 비트연산자 : 비트 단위의 연산 수행
public class OperateMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10, y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); // 정수끼리 나누셈은 몫을 구하는 연산이 됨
        System.out.println((double) x / y); // 나눗셈
        System.out.println(x % y); // % 나머지 연산자, 몫을 구하고 남은 나머지를 구하는 연산

        // 대입 연산자 =,-=,*=,/=,%=
        // 디입은 변수에 우변값을 집어 넣는 것
        System.out.println(x += 2);
        System.out.println(x -= 2);
        System.out.println(x * 2);
        System.out.println(x /= 2);
        System.out.println(x %= y);

        // 증감 연산자 : 단항연산자,피연산자의 값을 1씩 증가 또는 감소 시킴 , 연산자의 위치에서 따라 결과가 달라짐
        int z = 10;
        System.out.println(z++); // 선 대입 후 증가
        System.out.println(z);

        // 비교 연산자 : 비교결과를 참과 거짓으로 반환
        int num1 = 10, num2 = 20;
        System.out.println(num1 > num2); // false
        System.out.println(num1 < num2); // true
        System.out.println(num1 >= num2); // false
        System.out.println(num1 <= num2); // true
        System.out.println(num1 != num2); // true

        // 논리 연산자 : 연산식을 비교해서 참과 거짓을 판단
        // && : AND, 좌변과 우변이 모드 참인 조건
        // || : OR, 둘 중 하나만 참이면 참
        // ! : NOT,현재의 조건을 부정 함
        System.out.println(num1 > 0 && num1 > num2); // false // 비교 연산자가 논리연산자 볻 ㅏ우선 순위가 높음
        System.out.println(num1 > 0 || num1 > num2); // true
        System.out.println(num1 > 0 || num1 > num2); // true

        // 삼항연산자 : 항 3개인 연산자, 간단한 조건물을 대체 할 수 있음

        // 실습 문제 2
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        String prString = (age > 19) ? age +"성인 입니다" : age + " 미성년자 입니다";
        System.out.println(prString);




    }
}
