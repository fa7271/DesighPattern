package Builder1;

public class Main {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();// 생성을 다른 객체에 넘김

        factory.setBlueprint(new LgGramBlueprint()); // 설계도를 넣어서
//        factory.setBlueprint(new MacAirBlueprint());
//        factory.setBlueprint(new SonyBlueprint());
//        Computer computer = factory.makeAndGet();

        factory.make(); // 만들어줌

        Computer computer = factory.getComputer(); //  설계도대로 만들어줌
        System.out.println(computer);
//        Computer computer = new Computer("17", "16giga", "256g ssd");

        System.out.println(computer.toString()); //
    }
}


// factory 가 Director
// Blueprint 는 설계도 >> AbstractBuilder
// LgGramBlueprint 가 ConcreateBuilder