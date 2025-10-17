package 에어컨실습;

import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon(false, 22, false, false, 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨 켜기 (yes / no) : ");
        String isON = sc.nextLine();
        if (isON.equalsIgnoreCase("yes")) {
            int elaqsedTime = 0; // 경과 시간 계산하기
            boolean changedTemp = false;  // 온도 변화 감지
            lgAirCon.setPower(true); // 전원 켜기
            lgAirCon.setAirCon();    // 에어컨 설정
            while (true) {
                sleep(1000);  // 1초 동안 대기
                elaqsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1: if (elaqsedTime >= 60) changedTemp = true; break;
                    case 2: if (elaqsedTime >= 30) changedTemp = true; break;
                    case 3: if (elaqsedTime >= 20) changedTemp = true; break;
                    default:
                        System.out.println("바람세기 설정 오류");
                        if (elaqsedTime >= 60) changedTemp = true;
                }
                if (changedTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();  // 온도가 변경 되었으므로 현재 상태를 보여줌
                    elaqsedTime = 0;
                    changedTemp = false;
                }
                // 현재 온도와 설정 온도가 같은 경우
                if (lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다");
                    break;
                }
            }
        }
    }
}
