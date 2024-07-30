package strategy.trymyown;

public class Shield implements Weapon{
    @Override
    public void attack() {
        System.out.println("발패로 밀치다.");
    }
}
