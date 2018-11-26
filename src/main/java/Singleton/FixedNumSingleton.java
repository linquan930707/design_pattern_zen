package Singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * 固定数量的单例模式
 */
public class FixedNumSingleton {
    private static int maxNum = 2;
    private String name;
    private static ArrayList<FixedNumSingleton>singletonArrayList = new ArrayList<FixedNumSingleton>(maxNum);
    static {
        for (int i = 0; i < maxNum; i++) {
            singletonArrayList.add(new FixedNumSingleton("张三"+i));
        }
    }
    private FixedNumSingleton(){};

    private FixedNumSingleton(String name){
        this.name = name;
    }
    public static FixedNumSingleton getInstance(){
        Random random = new Random();
        return singletonArrayList.get(random.nextInt(maxNum));

    }
    public String getName(){
        return getInstance().name;
    }

}
