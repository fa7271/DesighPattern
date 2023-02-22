package Builder1;

public class ComputerFactory {
    private BluePrint print;
    public void setBlueprint(BluePrint print) {
        this.print = print;
    }
    //설계도를 하나 가져있고


    // 만든다음에
    public void make()
    {
        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    // 만들어진 거를 가지고 옴
    public Computer getComputer() {
        return print.getComputer();
    }
}
