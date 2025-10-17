package 상속TV;

// 파일 이름: InheritanceTVMain.java

public class InheritanceTVMain {
    public static void main(String[] args) {
        System.out.println("### 1. ProtoTypeTV (부모) 객체 테스트 ###");
        ProtoTypeTV oldTV = new ProtoTypeTV();
        oldTV.powerToggle();
        oldTV.channelUp();
        oldTV.volumeUp();
        oldTV.viewTV(); // ProtoTypeTV의 상태 확인 메서드 호출

        System.out.println("\n" + "=".repeat(40) + "\n");

        System.out.println("### 2. ProductTV (자식) 객체 테스트 ###");
        ProductTV newTV = new ProductTV(false, 1, 10);
        newTV.powerToggle();

        System.out.println("\n>> 확장된 기능(오버라이딩) 테스트");
        newTV.setChannel(1500); // 부모에게는 없는 1000번대 채널로 변경
        // 볼륨을 150까지 올리기
        for (int i = 0; i < 140; i++) {
            newTV.volumeUp();
        }
        System.out.println(newTV); // ProductTV의 toString() 호출

        System.out.println("\n>> 추가된 기능(오버로딩) 테스트");
        newTV.setChannel(true, 0); // 인터넷 모드 켜기
        System.out.println(newTV);

        newTV.setChannel(false, 999); // 인터넷 끄고 채널 999로 변경
        System.out.println(newTV);
    }
}