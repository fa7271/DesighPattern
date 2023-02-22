package Prototype.DeepShallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();

        navi.setName("navi");
        navi.setAge(new Age(2012,3));

//        Cat yo = navi; // 복사
        Cat yo = navi.copy(); // 깊은 복사
        yo.setName("boseok");

        yo.getAge().setValue(2013);
        yo.getAge().setValue(2);
        //age는 깊은복사가 안됐다. >> 해결방법 Cat 에서 clone 할때 복사시에 바ㄱ

        System.out.println("navi = " + navi.getName());
        System.out.println("yo.getAge() = " + navi.getAge().getYear());
        System.out.println("yo = " + yo.getName());
        System.out.println("yo.getAge() = " + yo.getAge().getYear());

        System.out.println("navi.getAge().getValue() = " + navi.getAge().getValue());
        System.out.println("yo.getAge().getValue() = " + yo.getAge().getValue());
        // 같게 나오는 이유 동일한 주소값을 쓴다.  navi 에 주솟값을 yo에 가져간다 >> 얕은복사 navi의 값을 주면>> 깊은복사
    }
}
