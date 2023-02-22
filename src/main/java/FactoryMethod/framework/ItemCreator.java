package FactoryMethod.framework;

public abstract class ItemCreator {
    // 메소드에서 필요한 알고리즘을 단계별로 나눠주고 차례대로 실행하는 형식 > 팩토리메소드
    public Item create() {

        Item item;
        requestItemsInfo(); // 1. 데베에서 아이템정보 호출하고
        item = createItem();// 2. 아이템 생성
        createItemLog(); //    3. 로그 호출
        // 위 부분이 템플릿메소드 이다
        return item;
    }
    // 아이템 정보 요청
    abstract protected void requestItemsInfo();
    //데베에 아이템 생성
    abstract protected void createItemLog();
    // 아이템 생서 알고리즘
    abstract protected Item createItem();
}
