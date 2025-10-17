package 회원정보예제;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        char num;
        int num1;
        // 이름
        System.out.println("이름 입력 : ");
        name = sc.nextLine();

        while (true){
            try{
                System.out.println("나이 입력: ");
                age = sc.nextInt();

                if (age >= 0 && age <=199) {
                    break;
                }else{
                    System.out.println("유효하지 않습니다 다시 입력하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다.");
            }
        }
        while (true){
            System.out.print("성별 입력: ");
            num = sc.next().charAt(0);

            if (num == 'M' || num == 'm' || num == 'F' || num == 'f') {
                break;
            }else {
                System.out.println("M 또는 F만 입력 가능");
            }
        }

        while (true){
            System.out.print("직업 선택 (1:학생, 2:회사원, 3:주부, 4:무직)");
            num1 = sc.nextInt();

            if ( num1 >= 1 && num1 <=4){
                break;
            }else {
                System.out.println("1 ~ 4 사이만 입력이 가능합니다");
            }
        }
        String num2;
        if (num == 'M' || num == 'm'){
            num2 = "남성";
        }else {
            num2 = "여성";
        }

        String num3;
        switch (num1){
            case 1:
                num3 = "학생";
            case 2:
                num3 = "회사원";
            case 3:
                num3 = "주부";
            case 4:
                num3 = "무직";
            default:
                num3 = "오류";
                break;
        }

        System.out.println("-----회원 정보 입력-------");
        System.out.println("이름" + name);
        System.out.println("나이" + age);
        System.out.println("성별" + num);
        System.out.println("직업" + num1);

        sc.close();
    }
}
