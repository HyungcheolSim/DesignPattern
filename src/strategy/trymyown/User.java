package strategy.trymyown;

public class User {
    Weapon weapon;

    public User() {}


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void doFunctionOfWeapon(){
        this.weapon.attack();
    }

    public static void main(String[] args) {
        Weapon sword = new Sword();
        Weapon shield = new Shield();
        Weapon crossbow = new Crossbow();
        User user = new User();


        user.setWeapon(sword);
        user.doFunctionOfWeapon();

        user.setWeapon(shield);
        user.doFunctionOfWeapon();

        user.setWeapon(crossbow);
        user.doFunctionOfWeapon();
    }
}
