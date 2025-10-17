package BMI계산기;

import java.util.Scanner;

public class TextMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 키 몸무게 입력 받기
        System.out.print("키(cmm)를 입력 하세요: ");
        double height = sc.nextDouble();

        System.out.print("몸무게(kg)를 입력 하세요: ");
        double weight = sc.nextDouble();

        // 키를 m단위로 변환 후 bmi 계산
        double num = height / 100.0;
        double BMI = weight / (num * num);

        //bmi 값 소수 둘째 자리까지 출력
        System.out.printf("당신의 bmi는%.2f입니다.%n",BMI);

        if (BMI <18.5){
            System.out.println("저체중입니다");
        } else if(BMI < 23){
            System.out.println("정상 입니다");
        }else if(BMI < 25){
            System.out.println("과체중 입니다");
        }else {
            System.out.println("비만 입니다");
        }


    }
}
