package strategy;

import strategy.trymyown.Crossbow;
import strategy.trymyown.Shield;
import strategy.trymyown.Sword;
import strategy.trymyown.Weapon;

public class User {
    public static void main(String[] args) {
        WeaponStrategy ws = new WeaponStrategy();
        Weapon sword = new Sword();
        Weapon shield = new Shield();
        Weapon crossbow = new Crossbow();

        ws.setWeapon(sword);
        ws.attack();

        ws.setWeapon(shield);
        ws.attack();

        ws.setWeapon(crossbow);
        ws.attack();
    }
}
