package Singleton;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 10,30,TimeUnit.MICROSECONDS,new LinkedBlockingQueue<Runnable>());
        /**
         * 饿汉模式
         * 用来获取数字
         */
        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
        /**
         * 懒汉模式
         */
        LazySingleton lazySingleton = LazySingleton.getInstance();

        /**
         * 多例模式
         */
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    FixedNumSingleton fixedNumSingleton = FixedNumSingleton.getInstance();
                    System.out.println(fixedNumSingleton.getName());
                }
            });

        }
        //使线程变为不可用状态，对正在进行的线程没有影响，对未使用的线程设置为不可用
        executor.shutdown();



    }
}
