package 상속TV;
// 시제품 tv 만들기
// 전원, 채널, 불륨 기능을 가짐.
// 채널은 1 ~ 999
// 불륨은 0 ~ 100
// 생성자 만들지 않음



// 상속을 주기 위한 시제품 TV
public class ProtoTypeTV {
    // 접근 제한자 : public(모든 접근 허용), protected(같은 패키지, 상속관계),
    // default(키워드 없음, 같은 패키지), private(같은 클래스)
    // 자식 클래스가 접근할 수 있도록 protected로 선언
    protected boolean power;      // 전원 (기본값 false: 꺼짐)
    protected int channel = 1;    // 채널 (기본값 1)
    protected int volume = 10;    // 볼륨 (기본값 10)


    // 생성자를 생략하면 기본 생성자가 만들어짐(숨어 있음)


    // --- TV의 기본 기능을 하는 메서드들 ---
    /**
     * 전원을 켜고 끄는 메서드
     */
    public void powerToggle() {
        this.power = !this.power;
        System.out.println(this.power ? "전원이 켜졌습니다." : "전원이 꺼졌습니다.");
    }

        /**
         * 채널을 1 올리는 메서드 (999 -> 1 순환)
         */
        public void channelUp() {
            if (!power) return; // 전원이 꺼져있으면 동작 안 함
            this.channel++;
            if (this.channel > 999) {
                this.channel = 1;
            }
            System.out.println("현재 채널: " + this.channel);
        }

        /**
         * 채널을 1 내리는 메서드 (1 -> 999 순환)
         */
        public void channelDown() {
            if (!power) return;
            this.channel--;
            if (this.channel < 1) {
                this.channel = 999;
            }
            System.out.println("현재 채널: " + this.channel);
        }

        /**
         * 볼륨을 1 올리는 메서드 (최대 100)
         */
        public void volumeUp() {
            if (!power) return;
            if (this.volume < 100) {
                this.volume++;
            }
            System.out.println("현재 볼륨: " + this.volume);
        }

        /**
         * 볼륨을 1 내리는 메서드 (최소 0)
         */
        public void volumeDown() {
            if (!power) return;
            if (this.volume > 0) {
                this.volume--;
            }
            System.out.println("현재 볼륨: " + this.volume);
        }

        /**
         * 현재 TV 상태를 보여주는 메서드
         */
        public void viewTV() {
            System.out.printf("--- 시제품 TV 상태 ---\n전원: %s, 채널: %d, 볼륨: %d\n", (power ? "ON" : "OFF"), channel, volume);
        }
}

