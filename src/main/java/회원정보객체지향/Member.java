package 회원정보객체지향;
// 이름, 나이, 성별, 직업

import java.util.Locale;
import java.util.Scanner;

// 클래스 이름은 대문자로 시작
public class Member {
    // private 접근제한자는 같은 클래스 내부에서만 접근 가능
    private  String name; // 인스턴스 필드, 객체 생성 시 함꼐 생성 됨
    private int age;
    private char gender;
    private int job;
    private Scanner sc = new Scanner(System.in);

    // 이름을 입력 받는 메서드 구현
    public void setName() {
        System.out.print("이름을 입력하세요: ");
        name = sc.next();
    }

    // 나이를 입력 받는 메서드, void는 반환값이 없는 경우 사용
    public void setAge() {
        while (true) {
            System.out.print("나이를 입력 하세요: ");
            age = sc.nextInt();
            if (age >= 0 && age < 100) return; // 메서드 반환, 메서드가 끝남
            System.out.println("나이를 정상적으로 입력하세요");
        }
    }
    // 성별 입력
    public void setGender() {
        while (true){
            System.out.print("성별 입력 하세요: ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') return;
            System.out.print("성별을 정상적으로 입력하세요");
        }
    }
    //직업 입력
    // public 접근제한자는 누구나 접근 가능
    public void setJob() {
        while (true){
            System.out.print("직업 입력 하세요: ");
            job = sc.nextInt();
            if (job > 0 && job < 5) return;
            System.out.println("직업을 정상적으로 입력하세요");
        }
    }

    public void viewMember() {
        // fina을 사용해 문자열 베열의 내용을 변경 할 수 없음을 지정
        final String[] jobStr = {" ", "학생", "회사원", "주부", "무직"}; // 문자열 0번 인덱스를 비운 이유는 입력 받는 값과 맞추기 위해서
        System.out.println("----- 회원 정보 입력 -----");
        System.out.println("이름 : " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + ((gender == 'M') ? "남성":"여성"));
        System.out.println("직업 : " + jobStr[job]);
    }

}
