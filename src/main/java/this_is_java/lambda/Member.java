package this_is_java.lambda;

public class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("기본 생성자 실행");
    }

    public Member(String id) {
        System.out.println("id 생성자 실행");
        this.id = id;
    }

    public Member(String name, String id) {
        System.out.println("name, id 생성자 실행");
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
