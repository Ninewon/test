package 배열실습;
// 평균점수 구하기
// 수강생이 5명, 각 학생의 점수 40점 미만이면 보충학습을 듣는 조건으로 40점으로 변경
// 55, 65, 30, 44, 25 => 55, 65, 40, 45, 40

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 5명의 학생의 성적으로 저장하는 배열 생성
        int[] scores = new int[5];
        // 5명의 성적을 입력 받기 (배열)
        System.out.println("학생 점수 입력 : ");
        for (int i =0; i < scores.length; i++){
            System.out.print((i + 1) + "번쨰 학생 점수 : ");
            scores[i] = sc.nextInt();
        }
        // 40점 미만의 성적은 40점으로 변경해서 평균 구하기
        int sum = 0;
        for(int score : scores){
            if (sum < 40){
                sum += 40; // 40점 미만이면 40점을 더함
            }else {
                sum += score; // 40점 이상이면 원래 점수를 더함
            }
        }
        // 평균 계산 (정확한 소수점 계산을 위해 double로 형변환)
        double avg = (double) sum / scores.length;
        // 결과 출력
        System.out.println("조정된 평균 점수는" + avg + "점 입니다");
        // 스캐너 리소스 정리
             sc.close();

        // 실습 문제 2번
        // 7자리의 로또 번호 생성하기(배열과 Math.random() 사용), 1 ~ 45 사이의 임의의 수 7개를 생성헤 배열에 저장하기
        // 7개의 로또 번호를 저장하는 배열 생성
        int[] num = new int[7];
        int rand;
        int index = 0;
        boolean isExist = false;
        while (true) {
            rand = (int) (Math.random() * 45) + 1;
            for (int i = 0; i < 7; i++) {  // 배열을 순회하면서 중복값 여부를 체크
                if (num[i] == rand) isExist = true; // 배열내에 현재 생성한 번호가 포함되어 있으면 flag를 true로 변경
            }
            if (!isExist) num[index++] = rand; // 해당 인덱스에 생성된 로또 번호를 대입 후 증가
            if (index == 7) break;
            isExist = false;  // 다시 flag를 초기화
        }
        for (int e : num) System.out.print(e + " ");
        System.out.println();
    }
}
