package singleton.lazyholder;

import java.util.concurrent.atomic.AtomicBoolean;

public class LazyHolderSingleton2 {
    // 원자성을 보장하는 Boolean 타입을 다루는 AtomicBoolean 클래스
    // 이 객체의 상태를 싱글톤 객체가 로딩 될 떄 false로 초기화된다.
    private static final AtomicBoolean isCreated = new AtomicBoolean(false);

    private LazyHolderSingleton2() {
        if (isCreated.get()) {
            throw new IllegalArgumentException("this instance is singleton instance");
        }
        //생성자가 처음 호출될 떄 isCreated 객체의 상태를 true로 바꾼다.
        isCreated.compareAndSet(false, true);
    }

    public static LazyHolderSingleton2 getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static final LazyHolderSingleton2 instance = new LazyHolderSingleton2();
    }

}
