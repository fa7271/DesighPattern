package javaa.abstractjava;

class Cat extends Vehicle {
    public String Catrun2;
    public void run() {
        System.out.println("고양이가 달린다");
    }

    public void run2() {
        System.out.println("강제 타입 변환확인"+Catrun2);
    }
}
