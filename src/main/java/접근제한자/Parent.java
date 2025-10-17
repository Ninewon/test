package 접근제한자;

public class Parent {
    protected String name; // 접근젭한자가 없으면, default
    protected String money;
    protected String addr;
    public  Parent() {
        name = "부자아빠";
        money = "350억";
        addr = "서울시 강남구 역삼동";

    }
}
