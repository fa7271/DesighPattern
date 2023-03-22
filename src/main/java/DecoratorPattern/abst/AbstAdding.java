package DecoratorPattern.abst;

abstract public class AbstAdding implements IBeverage {

    private IBeverage base; // 장식을 가져와서 꾸며줘야함

    public AbstAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}
