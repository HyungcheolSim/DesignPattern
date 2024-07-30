package strategy;

import strategy.trymyown.Weapon;

public class WeaponStrategy {
    Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack(){
        weapon.attack();
    }
}
