package 표준출력;
// 자바의 표준 입출력 클래스 : System
// System.in :  표준 입력 스트림
// System.out : 표준 출력 스트림
// System.out.println(내용)
// System.out.print(내용)
// System.out.printf("서식", 내용)
// System.err : 표준 오류 스트림

// 이스케이프 스퀀스 : \n, \r, \t, \b, \\

// 이름, 전화번호, 주소, 국어, 영어 , 수학 성적을 정하고, 평균과 총점을 구해서 출력하기
public class StandardMain {
    public static void main(String[] args) {
        String name = "김건우";
        String gur = "010-5364-3093";
        String addr = "Seoul city";
        char age = 'M';
        int kor = 50;
        int eng = 60;
        int met = 70;
        int total = kor + eng + met;
        double avg = total / 3;
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.println("이름 : " + name);
        System.out.println("전번 : " + gur);
        System.out.println("주소 : " + addr);
        System.out.println("나이 : " +((age=='M')? "남성" : "여성"));

        // 서직지정자 스타일   : %
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("총점 : %s\n", total);
        System.out.printf("평균 : %s.2f\n",avg);
    }
}
