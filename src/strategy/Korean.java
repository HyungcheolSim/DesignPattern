package strategy;

public class Korean implements TranslateStrategy{

    @Override
    public void translate() {
        System.out.println("한국어로 번역합니다. 삐-비-빅");
    }
}
