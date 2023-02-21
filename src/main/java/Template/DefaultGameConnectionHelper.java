package Template;

//하위 메소드
public class DefaultGameConnectionHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String string) {

        System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("확인");
        return true;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("10시이후 권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
