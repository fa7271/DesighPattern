package SingleTon;

public class SystemSpeaker {

    static private SystemSpeaker instance; // 하나만 있어야하는 스피커
    private int volume;

    private SystemSpeaker() {
        volume = 5;
//        다른데서 생성 못하게 하기 위해서 private
    }
    public static SystemSpeaker getInstance() { // getinstance 를 받기 위해서 static
        if (instance == null) { // 스피커가 없으면
            instance = new SystemSpeaker(); // 초기화 해줘야함
            System.out.println("새로생성");
        }else{
            System.out.println("이미생성");
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
