package Super실습;

public class SuperCar extends Car{
    boolean isTurbo;
    public SuperCar(){
        // 부모의 생성자 호출을 생략하면 기본 생성자가 호출 됨 : super()
        isTurbo = false;
    }
    public SuperCar(String name) {
        super(280, "Red");
        isTurbo = true;
        this.name = name;
    }
    @Override
    void  displayInfo(){
        System.out.println("속도: " + speed);
        System.out.println("색상: " + color);
        System.out.println("이름: " + name);
        System.out.println("터보 : " + ((isTurbo) ? "ON" : "OFF"));
    }
}
