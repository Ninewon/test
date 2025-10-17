package 상속TV;
//ProtoTypeTV를 상속 받음
// 불륨을 오버라이드해서 0 ~ 200까지 확장
// 채널도 오버라이드해서 1 ~ 1999까지 확장 (setChannel())
// 매개변수가 있는 생성자와 없는 생성자 만들기
// 채널을 오버로딩을 해서 setChannel(boolean internet, int channel) 기능 확장
// - internet 기능이 켜지면 채널 설정 정보는 무시하고 인터넷 티비로 동작
// 결과 출력은 toString() 메서드를 오버라이딩 해서 구현




public class ProductTV extends ProtoTypeTV {

        // ProductTV만의 고유 기능
        private boolean internetMode;

        // 요구사항: 매개변수가 없는 생성

    public ProductTV() {
        this.internetMode = internetMode;
    }

    // 요구사항: 매개변수가 있는 생성자
        public ProductTV(boolean power, int channel, int volume) {
            // 부모로부터 물려받은 protected 필드를 직접 초기화
            this.power = power;
            this.channel = channel;
            this.volume = volume;
        }

        // 요구사항: 불륨 오버라이드 (0 ~ 200)
        @Override
        public void volumeUp() {
            if (!power) return;
            if (this.volume < 200) { // 최대 볼륨을 200으로 변경
                this.volume++;
            }
            System.out.println("현재 볼륨: " + this.volume);
        }

        @Override
        public void volumeDown() {
            if (!power) return;
            if (this.volume > 0) {
                this.volume--;
            }
            System.out.println("현재 볼륨: " + this.volume);
        }

        // 요구사항: 채널 오버라이드 (1 ~ 1999) 및 setChannel()
        @Override
        public void channelUp() {
            if (!power) return;
            this.channel++;
            if (this.channel > 1999) { // 최대 채널을 1999로 변경
                this.channel = 1;
            }
            System.out.println("현재 채널: " + this.channel);
        }

        @Override
        public void channelDown() {
            if (!power) return;
            this.channel--;
            if (this.channel < 1) {
                this.channel = 1999;
            }
            System.out.println("현재 채널: " + this.channel);
        }

        /**
         * 채널 번호를 직접 설정하는 메서드 (기능 확장)
         */
        public void setChannel(int channel) {
            if (!power) return;
            if (channel >= 1 && channel <= 1999) {
                this.channel = channel;
                System.out.println("채널을 " + channel + "번으로 설정했습니다.");
            } else {
                System.out.println("유효하지 않은 채널 번호입니다. (1~1999)");
            }
        }

        // 요구사항: 채널 오버로딩 (인터넷 기능)
        public void setChannel(boolean internet, int channel) {
            if (!power) return;
            if (internet) {
                this.internetMode = true;
                System.out.println("인터넷 모드로 전환합니다.");
            } else {
                this.internetMode = false;
                System.out.println("일반 방송 모드로 전환합니다.");
                setChannel(channel); // 위에서 만든 setChannel(int)를 호출
            }
        }

        // 요구사항: 결과 출력을 위한 toString() 메서드 오버라이딩
        @Override
        public String toString() {
            return String.format(
                    "--- 제품 TV 상태 ---\n전원: %s, 채널: %d, 볼륨: %d, 인터넷 모드: %s",
                    (power ? "ON" : "OFF"), channel, volume, (internetMode ? "ON" : "OFF")
            );
        }
        // 메서드 오버로딩 : 메서드 이름이 동일하고, 메서드 매개변수의 갯수 또는 타입으로 메서드를 구분해서 호출하는 것 (정적 바인딩)
    }

