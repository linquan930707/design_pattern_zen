package factoryModel.factory;

/**
 * 工厂模式
 *  定义一个用于创建对象的接口，让子类去实例化哪一个类，工厂方法使一个类的实例化延迟到其子类
 */
public class Test {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        YellowHuman YHuman = factory.createHuman(YellowHuman.class);
        YHuman.getColor();
        YHuman.talk();
        BlackHuman BHuman = factory.createHuman(BlackHuman.class);
        BHuman.getColor();
        BHuman.talk();

    }
}
