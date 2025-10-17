package 표준입력실습;

import java.util.Scanner;

// 이름(next()), 전화번호(next()), 주소(nextline()),성별(char),나이(int),직업(문자열)을 입력 받아 이쁘게 출력
// 스캐너 연속 입력 시 버퍼 비우기 필요 할 수 있음 : sc.nextline()
// 성별은 'm' 또는 'f'로 입력 받아 출력시 남성과 여성으로 출력
public class InputExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.next();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("주소를 입력하세요: ");
        String address = sc.nextLine();

        System.out.print("성별을 입력하세요 (m/f): ");
        char genderChar = sc.next().charAt(0);
        String gender = (genderChar == 'm' || genderChar == 'M') ? "남성" : "여성";
        sc.nextLine(); // 버퍼 비우기

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("직업을 입력하세요: ");
        String job = sc.nextLine();

        System.out.println("\n--- 입력 정보 ---");
        System.out.println("이름: " + name);




        System.out.println("전화번호: " + phoneNumber);
        System.out.println("주소: " + address);
        System.out.println("성별: " + gender);
        System.out.println("나이: " + age);
        System.out.println("직업: " + job);
        System.out.println("-----------------");

        sc.close();
    }
}