package Strategy;

public class GameCharaceter {
    // 접근점 만들어줌
    private Weapon weapon;

    // 무기가 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null){
            System.out.println("x");
        }
        else{
            weapon.attack();
        }

    }
}
