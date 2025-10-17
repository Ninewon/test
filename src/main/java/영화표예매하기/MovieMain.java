package 영화표예매하기;

// 메뉴: [1] 예매하기 [2] 취소하기 [3] 종료하기


import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // TODO: 좌석당 가격을 생성자로 전달해서 객체 생성
        MovieTicket movieTicket = new MovieTicket(12000); // 좌석당 12,000원으로 설정

        // TODO: 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO: while 반복문 생성 ([1] 예매하기 [2] 취소하기 [3] 종료하기)
        while (true) {
            System.out.println("\n========== 영화 예매 시스템 ==========");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 예매취소");
            System.out.println("[3] 총 매출액 확인 및 종료");
            System.out.print(">> 메뉴를 선택하세요 : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    movieTicket.reserveSeat(); // 예매 메서드 호출
                    break;
                case 2:
                    movieTicket.cancelSeat(); // 취소 메서드 호출
                    break;
                case 3:
                    int total = movieTicket.getTotalSales(); // 총 매출액 계산
                    System.out.println("=================================");
                    System.out.println("총 매출액은 " + total + "원 입니다.");
                    System.out.println("프로그램을 종료합니다.");
                    sc.close(); // 스캐너 리소스 정리
                    return; // 프로그램 종료
                default:
                    System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}