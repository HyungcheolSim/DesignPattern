package strategy.trymyown;

public class Sword implements Weapon{

    @Override
    public void attack() {
        System.out.println("칼을 휘두르다.");
    }
}
