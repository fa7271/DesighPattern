package javaa.interface_8;

public class Annoymous {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnon() {
            System.out.println("TV를켭니다");
        }

        @Override
        public void turnoff() {
            System.out.println("TV를끕니다");
        }
    };

    void method1() {
        System.out.println("1");
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnon() {
                System.out.println("오디오켭니다");
            }

            @Override
            public void turnoff() {
                System.out.println("오디오큽니다");
            }
        };
        localVar.turnon();
    }

    void method2(RemoteControl rc) {
        rc.turnon();
    }
}
