package TV만들기;

public class TVMain {
    public static void main(String[] args) {
        Television lgTv = new Television(true,10,30);
        Television samsungTv = new Television(false, 25, 15);
        Television appleTv = new Television(true, 1, 100);


        System.out.println("LG TV 정보: " + lgTv);
        System.out.println("삼성 TV 정보: " + samsungTv);
        System.out.println("애플 TV 정보: " + appleTv);

        System.out.println("\n--- 삼성 TV 채널 및 볼륨 변경 ---");
        samsungTv.setPowerOn(true); // 전원 켜기
        samsungTv.setChannel(120);
        samsungTv.setVolume(55);
        System.out.println("삼성 TV 변경된 정보: " + samsungTv);
    }
}
