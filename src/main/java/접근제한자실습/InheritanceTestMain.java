package 접근제한자실습;

// 메인 클래스
public class InheritanceTestMain {
     public static void main(String[] args) {
//        // 1. Person 객체 생성 및 필드 접근 테스트
//        System.out.println("<<<<< Person 객체 테스트 >>>>>");
//        Person person = new Person("김부모", 50, "서울시 강남구", "750101-1234567");
//
//        // 각 필드에 접근 시도
//        System.out.println("이름(public): " + person.name);          // O : public 이므로 어디서든 접근 가능
//        System.out.println("나이(protected): " + person.age);        // O : 같은 패키지이므로 접근 가능
//        System.out.println("주소(default): " + person.addr);         // O : 같은 패키지이므로 접근 가능
//        // System.out.println("주민번호(private): " + person.ssn);   // X : private 이므로 외부 클래스에서 접근 불가 (컴파일 에러)
//        System.out.println("주민번호(getter): " + person.getSsn());     // O : public 메서드를 통해 간접적으로 접근 가능
//
//        System.out.println("\n----------------------------------\n");
//
//        // 2. Student 객체 생성 및 필드 접근 테스트
//        System.out.println("<<<<< Student 객체 테스트 >>>>>");
//        Student student = new Student("이자식", 20, "서울시 서초구", "050505-3456789", "한국대학교");
//
//        // 부모로부터 물려받은 필드에 접근 시도
//        System.out.println("이름(public): " + student.name);          // O : public 이므로 접근 가능
//        System.out.println("나이(protected): " + student.age);        // O : 같은 패키지이므로 접근 가능
//        System.out.println("주소(default): " + student.addr);         // O : 같은 패키지이므로 접근 가능
//        // System.out.println("주민번호(private): " + student.ssn);   // X : 부모의 private 멤버는 자식도 직접 접근 불가 (컴파일 에러)
//        System.out.println("주민번호(getter): " + student.getSsn());     // O : 상속받은 public 메서드로 접근 가능
//
//        // 자식 클래스 자신의 필드에 접근 시도
//        // System.out.println("학교(private): " + student.school);   // X : private 이므로 외부 클래스에서 접근 불가 (컴파일 에러)
//        System.out.println("학교(getter): " + student.getSchool());     // O : public 메서드를 통해 간접적으로 접근 가능
//
//        System.out.println();
//
//        // 3. showInfo() 메서드 호출
//        student.showInfo();

         Person p1 = new Person("장원영", 22, "서울시", "030101-411111");
         Student s1 = new Student("안유진", 23, "대전시", "020101-4164414", "찬인고");

         System.out.println("이름: " + s1.name);
         System.out.println("나이: " + s1.age);
         System.out.println("주소: " + s1.addr);

         s1.showInfo();

         System.out.println("이름: " + s1.name);
         System.out.println("나이: " + s1.age);
         System.out.println("주소: " + s1.addr);
         System.out.println("주민번호 : " + s1.getSsn());

    }
}
