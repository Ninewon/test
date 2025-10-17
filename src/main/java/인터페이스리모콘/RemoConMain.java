package 인터페이스리모콘;
// 인터페이스 : 클래스가 구현해야 할 메서드들의 설계 명세
// - "이런 기능을 제공해야 한다"는 규칙 또는 약속을 정의
// - 이를 통해 다양한 클래스 동일한 기능을 일관된 형식으로 규현 할 수 있음
// - 자바는 클래스의 다중 상속을 허용하지 않지만, 인터페이스 다중 구현이 가능

// RemoteControl 인터페이스를 상속 받아 Audio 클래스 생성
// RemoteControl 인터페이스를 상속 받아 PS4 클래스 생성
// RemoteControl 인터페이스를 상속 받아 Computer 클래스 생성




import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {

        // 제품을 선택 하세요 [1]Audio [2]PS4 [3]Computer 기능을 추가해서 기능을 동작 시키기
        System.out.println("제품을 선택하세요 [1]Audio [2]PS4 [3]Computer : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        RemoteControl rc;  // RemoteControl 인터페이스에 대한 참조 변수
       switch (choice) {
           case 1: rc = new Audio(); break;
           case 2: rc = new PS4(); break;
           case 3: rc = new Computer(); break;
           default: rc = null;
       }
       rc.turnOn();
       rc.setVolume(34);

       RemoteControl anonymous = new RemoteControl() {
           private int volume;
           @Override
           public void turnOn() {
               System.out.println("Car Audio를 켭니다");
           }

           @Override
           public void turnOff() {
               System.out.println("Car Audio를 끕니다");
           }


           @Override
           public void setVolume(int volume) {
               if (volume > RemoteControl.MAX_VOLUME) {
                   this.volume = RemoteControl.MAX_VOLUME;
               }else if(volume < RemoteControl.MIN_VOLUME) {
                   this.volume = RemoteControl.MIN_VOLUME;
               }else {
                   this.volume = volume;
               }
           }
       };
       rc.turnOn();
       rc.setVolume(28);
    }
}
