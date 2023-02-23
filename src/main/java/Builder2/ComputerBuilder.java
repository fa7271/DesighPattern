package Builder2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ComputerBuilder {
    private Computer computer;
    private ComputerBuilder() {
        computer = new Computer("default","default","default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder(); // ssd는 default가 들어감
    }

    public ComputerBuilder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string) {
        computer.setRam(string);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }
    public Computer build() {
        return this.computer;
    }

//    public ComputerBuilder setStroage(String string) {
//        computer.setStorage(string);
//        return null;
//    }
}
