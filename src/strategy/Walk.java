package strategy;

public class Walk implements MoveStrategy{

    @Override
    public void move() {
        System.out.println("걸어서 배달합니다. 삐-빅");
    }
}
