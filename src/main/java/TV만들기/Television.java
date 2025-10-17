package TV만들기;
// 전원 : ON/OFF
// 채널 : 1 ~ 999
// 불륨 : 0 ~ 100사이
// 인스턴스 필드와 게터, 세터 메서드 구현
// 매개변수가 있는 생성자를 통해 기본값 대입
// TV 3대 만들기
// TV의 정보는 toString 메서드를 오버라이드 해서 출력하기


public class Television {
    // 인스턴스 필드 (멤버 변수)
    private boolean isPowerOn; // 전원 상태 (ON/OFF)
    private int channel;       // 채널 (1 ~ 999)
    private int volume;        // 볼륨 (0 ~ 100)

    // 매개변수가 있는 생성자
    public Television(boolean isPowerOn, int channel, int volume) {
        this.isPowerOn = isPowerOn;
        this.channel = channel;
        this.volume = volume;
    }

    //매개변수가 없는 생성자
    public Television(){
        isPowerOn = false;
        channel = 20;
        volume = 30;
    }

    //매개변수가 1개 있는 생성자
    public  Television(boolean isPowerOn) {
        this.isPowerOn = false;
        channel = 20;
        volume = 30;
    }



    // --- 게터(Getter) 메서드 ---
    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    // --- 세터(Setter) 메서드 ---
    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 999) {
            this.channel = channel;
            System.out.println("채널을" + channel + "로 변경 하셨습니다");
        } else {
            System.out.println("유효하지 않은 채널 번호입니다. (1~999)");
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("불륨을" + volume + "으로 변경 하였습니다");
        } else {
            System.out.println("유효하지 않은 볼륨 크기입니다. (0~100)");
        }
    }

    // toString() 메서드 오버라이드
    @Override
    public String toString() {
        return "전원: " + (isPowerOn ? "ON" : "OFF") + ", 채널: " + channel + ", 볼륨: " + volume;
    }
}
