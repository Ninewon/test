package 접근제한자실습;

public class Person {
    public String name;   // public : 누구나 접근 가능
    protected int age; // protected : 같은 패키지 + 자식 클래스에서 접근 가능
    String addr;          // default(package - private) 같은 패키지 내에서만 접근 가능
    private String ssn;   // private : 클래스 내부에서만 접근 가능

    // 생성자 : 객체 생성 시 필드를 초기화
    public Person (String name, int age, String addr, String ssn){
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.ssn = ssn;
    }

    // private 필드인 ssn에 접근하기 위한 public Getter 메서드
    public String getSsn() {
        return ssn;
    }
}


