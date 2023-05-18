package javaa.abstractjava;

public class smatPhone {
    private String company;
    private String os;

    public smatPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    public String toString() {
        return company + ", " + os;
    }
}
