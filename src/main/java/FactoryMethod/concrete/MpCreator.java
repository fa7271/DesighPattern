package FactoryMethod.concrete;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마력 물약의 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("데이터베이스에서 마력 물약을 새로 생성" + new Date());
    }

    @Override
    protected Item createItem() {
        return new Mppotion();
    }
}
