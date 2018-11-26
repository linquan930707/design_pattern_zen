package Singleton;

/**
 * 单例模式-懒汉模式（注意线程不安全的）
 */
public class LazySingleton {
    private static LazySingleton singleton = null;
    private LazySingleton(){};
    public static synchronized LazySingleton getInstance(){
        if(singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
