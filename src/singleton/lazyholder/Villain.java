package singleton.lazyholder;

import java.lang.reflect.Constructor;

public class Villain {
    public static void ReflectionAttack() throws Exception{
        LazyHolderSingleton lazyHolder1 = LazyHolderSingleton.getInstance();

        Constructor<? extends LazyHolderSingleton> constructor = lazyHolder1.getClass().getConstructor(new Class[0]);
        constructor.setAccessible(true);
        LazyHolderSingleton lazyHolder2 = constructor.newInstance();
    }
}
