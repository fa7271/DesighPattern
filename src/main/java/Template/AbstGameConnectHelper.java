package Template;

public abstract class AbstGameConnectHelper{
    protected abstract String doSecurity(String str);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);

//    노출이 되면 안됨 >> private 을 붙이는것은 안됨 이유 하우클래스가 재정의 해야함
//    protected 외부에서는 호출 못하지만 하위클래스에서 사용할 수 있다.


    // 템플릿 메소드
    public String requestConnection(String encodedInfo){
        //보안 -> 암호화 된 문자열을 복호화

        String decodedInfo = doSecurity(encodedInfo);

        String id = "AAA";
        String password = "BBB";

        // 인증 과정
        if (!authentication(id,password)){
            throw new Error("로그인 실패");
        }

        // 권한
        String username = "";
        int i = authorization(username);
        if(i==0){
            System.out.println("game manager");
        } else if (i == 1) {
            System.out.println("유료");
        } else if (i == -1) {
            throw new Error("Shut Down");
        } else{
            System.out.println("무");
        }
        return connection(decodedInfo);

    }
}
