package factoryModel.singletonFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public   class  SingletonFactory {
    private static Singleton singleton;
    static {
        Class c = Singleton.class;
        try {
            //获取无参构造
            Constructor constructor = c.getDeclaredConstructor();
            //设置无参构造可访问
            constructor.setAccessible(Boolean.TRUE);
            singleton =(Singleton) constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static Singleton getInstance(){
        return singleton;
    }




}
