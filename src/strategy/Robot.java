package strategy;

public class Robot {
    MoveStrategy moveStrategy;
    TranslateStrategy translateStrategy;

    public Robot(MoveStrategy moveStrategy,TranslateStrategy translateStrategy) {
        this.moveStrategy = moveStrategy;
        this.translateStrategy = translateStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setTranslateStrategy(TranslateStrategy translateStrategy) {
        this.translateStrategy = translateStrategy;
    }

    void move(){
        moveStrategy.move();
    }

    void translate(){
        translateStrategy.translate();
    }
}
