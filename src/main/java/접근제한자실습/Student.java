package 접근제한자실습;

// Person 클래스를 상속받는 자식 클래스 Student
public class Student extends Person {
    private String school; // private: Student 클래스 내부에서만 접근 가능

    // 생성자
    public Student(String name, int age, String addr, String ssn, String school) {
        // super()를 통해 부모 클래스의 생성자를 호출하여 부모 필드를 초기화
        super(name, age, addr, ssn);
        this.school = school; // 자식 클래스 자신의 필드 초기화
    }

    // private 필드인 school에 접근하기 위한 public Getter 메서드
    public String getSchool() {
        return school;
    }

    // 정보를 출력하는 메서드
    public void showInfo() {
        System.out.println("--- 학생 정보 ---");
        // 부모의 public, protected, default 필드에 접근 가능
        System.out.println("이름: " + name);     // public 접근 가능
        System.out.println("나이: " + age);      // protected 접근 가능 (상속 관계)
        System.out.println("주소: " + addr);     // default 접근 가능 (같은 패키지)

        // 부모의 private 필드는 직접 접근 불가! Getter 메서드를 사용해야 함
        // System.out.println("주민번호: " + ssn); // 컴파일 에러 발생!
        System.out.println("주민번호: " + getSsn()); // Getter를 통해 접근 가능

        // 자신의 private 필드 접근
        System.out.println("학교: " + school);
        System.out.println("---------------");
    }
}