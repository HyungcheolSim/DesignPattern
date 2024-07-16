package singleton.staticblock;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    static {
        try{
            instance = new Singleton();
        } catch (Exception e){
            throw new RuntimeException("싱글톤 객체 생성 오류");
        }
    }
    public static Singleton getInstance(){
        return instance;
    }
}
