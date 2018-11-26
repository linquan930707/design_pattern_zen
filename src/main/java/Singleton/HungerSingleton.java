package Singleton;

/**
 * 单例模式-饿汉模式（线程安全的）
 */
public class HungerSingleton {
    private static final HungerSingleton hungerSingleton = new HungerSingleton();
    private HungerSingleton(){};
    public static HungerSingleton getInstance(){
        return hungerSingleton;
    }

}
