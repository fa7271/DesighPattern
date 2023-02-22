package Builder1;

//디렉터
public class Computer { // 복잡한 단계 거처야하는 객체
    private String Cpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String ram, String storage) {
        this.Cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override // 객체가 가지고 있는 문자열을 반환
    public String toString() {
        return Cpu +","+ram+","+storage;
    }
}
