package 영화표예매하기;

import java.util.Scanner;

public class MovieTicket {
    // TODO: 좌석 10개 대한 배열 생성
    // 0은 빈 좌석, 1은 예매된 좌석
    private int[] seats = new int[10];

    // TODO: 좌석당 가격을 받기 위한 인스턴스 필드 생성
    private int ticketPrice;

    // TODO: 입력용 스캐너 생성
    private Scanner sc = new Scanner(System.in);

    // TODO: 생성자를 만들고 가격을 주입(매개변수) 받음
    public MovieTicket(int price) {
        this.ticketPrice = price;
        System.out.println("좌석당 가격: " + price + "원으로 영화관이 생성되었습니다.");
    }

    // TODO: 좌석 상태를 출력하는 메서드 생성 : 배열의 값이 0이면 [ ], 1이면 [V]
    public void printSeats() {
        System.out.println("-------------------------------------");
        System.out.print("좌석 번호: ");
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%2d ", i + 1); // 좌석 번호 1~10 출력
        }
        System.out.println();
        System.out.print("예매 상태: ");
        for (int seat : seats) {
            if (seat == 0) {
                System.out.print("[ ] "); // 빈 좌석
            } else {
                System.out.print("[V] "); // 예매된 좌석
            }
        }
        System.out.println("\n-------------------------------------");
    }

    // TODO: 좌석 예매 메서드
    public void reserveSeat() {
        printSeats(); // 현재 좌석 상태 보여주기
        System.out.print("예매할 좌석 번호를 입력하세요 (1-10): ");
        int seatNum = sc.nextInt();

        // 유효하지 않은 좌석 번호 처리
        if (seatNum < 1 || seatNum > 10) {
            System.out.println("잘못된 좌석 번호입니다. (1~10 사이로 입력)");
            return;
        }

        // 배열 인덱스는 0부터 시작하므로 입력값에서 1을 빼줌
        int seatIndex = seatNum - 1;

        // 이미 예매된 좌석인지 확인
        if (seats[seatIndex] == 1) {
            System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택해주세요.");
        } else {
            seats[seatIndex] = 1; // 좌석 예매 처리
            System.out.println(seatNum + "번 좌석 예매가 완료되었습니다.");
        }

        printSeats(); // 변경된 좌석 상태 보여주기
    }

    // TODO: 좌석 취소 메서드
    public void cancelSeat() {
        printSeats(); // 현재 좌석 상태 보여주기
        System.out.print("취소할 좌석 번호를 입력하세요 (1-10): ");
        int seatNum = sc.nextInt();

        // 유효하지 않은 좌석 번호 처리
        if (seatNum < 1 || seatNum > 10) {
            System.out.println("잘못된 좌석 번호입니다. (1~10 사이로 입력)");
            return;
        }

        int seatIndex = seatNum - 1; // 배열 인덱스 계산

        // 예매되지 않은 좌석인지 확인
        if (seats[seatIndex] == 0) {
            System.out.println("해당 좌석은 예매되지 않았습니다.");
        } else {
            seats[seatIndex] = 0; // 좌석 취소 처리
            System.out.println(seatNum + "번 좌석 예매가 취소되었습니다.");
        }

        printSeats(); // 변경된 좌석 상태 보여주기
    }

    // TODO: 종료하기 선택 시 총 매출액 보여 주기
    public int getTotalSales() {
        int reservedCount = 0;
        for (int seat : seats) {
            if (seat == 1) {
                reservedCount++; // 예매된 좌석 수 카운트
            }
        }
        return reservedCount * ticketPrice; // (예매된 좌석 수) * (티켓 가격)
    }
}
