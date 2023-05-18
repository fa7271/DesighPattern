package javaa.abstractjava;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnon() {
        System.out.println("폰 킴");
    }
    public void turnoff() {
        System.out.println("폰 끔");
    }
}
