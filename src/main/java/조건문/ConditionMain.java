package 조건문;

// 제어문 : 프로그램이 원하는 결과를 얻기 위해 프로그램의 흐름을 제어 하는 것
// 조건문 : 주어진 조건식에 따라 조건을 분기 하는 것
// 반복문 : 주어진 조간이 참인 동안 반복 수행


import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 국어, 영어, 수학 성적을 입력 받음
        // 이름도 입력 받음
        // 국어 영어 수학 성적이, 0 미만이거나 100초과이면 입력 오류라고 출력
        // 정상적인 입력이라면 총점과 평균을 구하고
        // 평균이 90점 이상이면 이름과 총점, 평균, 등급 : A
        // 평균이 80점 이상이면 이름과 총점, 평균, 등급 : B
        // 평균이 70점 이상이면 이름과 총점, 평균, 등급 : C
        // 평균이 60점 이상이면 이름과 총점, 평균, 등급 : D
        // 나머지는 이름과 총점, 평균, 등급 : F

        // 1. 이름 입력
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        // 2. 점수 입력
        System.out.print("국어 점수를 입력하세요 (0-100): ");
        int kor = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 (0-100): ");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 (0-100): ");
        int met = sc.nextInt();

        if (kor < 0 || kor > 100) {
            System.out.println("국어 성적 입력 오류");
        }
        if (kor < 0 || eng > 100) {
            System.out.println("영어 성적 입력 오류");
        }
        if (kor < 0 || met > 100) {
            System.out.println("수학 성적 입력 오류");
        }

        // 3. 점수 유효성 검사 (0-100 범위 확인)
        if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || met < 0 || met > 100) {
            System.out.println("입력 오류: 점수는 0에서 100 사이여야 합니다.");
        } else {
            // 4. 총점 및 평균 계산
            int total = kor + eng + met;
            double avg = (double) total / 3;
            String grade;

            // 5. 등급 판별
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else if (avg >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            // 6. 결과 출력
            System.out.println("\n--- 성적 결과 ---");
            System.out.println("이름: " + name);
            System.out.println("총점: " + total);
            System.out.printf("평균: %.2f\n", avg);
            System.out.println("등급: " + grade);
        }

        sc.close();
    }
}