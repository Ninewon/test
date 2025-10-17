package 날짜와시간;
// Date 클래스 : JDK 1.0에서 도입된 가장 오래된 방식, 내부적으로 long 타입으로 저장되며, 시간 계산에 직접 사용하기 어려움 (비권장 처리)
// Calender 클래스 : JDK 1.1에 도입, 멀티스래드 환경에서 안정적이지 못함
// JAVA.time 패키지에 있는 클래스 사용 권장 : LocalDate, LcalTime, LocalDateTime, ZonedDateTime

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;

public class TimeMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   // 운영체제로 부터 현재 날짜 가져옴
        LocalTime time = LocalTime.now();   // 현재 시간을 가져 옴
        LocalDateTime dateTime = LocalDateTime.now();  // 날짜와 시간을 가져 옴
        ZonedDateTime zoned = ZonedDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zoned);

        // 2025년 10월 17일 오전 9시39분38초
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 DD일 a hh시 mm분 ss초");
        System.out.println(dateTime.format(formatter));

        // 2025/10/17 AM 09:39:38
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/DD a hh:mm:ss");
        // 2025-10-17 23:45:45
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("");
    }
}
