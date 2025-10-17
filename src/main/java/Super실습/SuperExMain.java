package Super실습;

public class SuperExMain {
    public static void main(String[] args) {
        SuperCar s1 = new SuperCar();
        SuperCar s2 = new SuperCar("포르쉐 211");

        s1.displayInfo();
        s2.displayInfo();
    }
}
