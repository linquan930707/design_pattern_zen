package factoryModel.simpleFactory;

/**
 * 简单工厂模式（静态工厂模式）
 */
public class HumanFactory {
    public static <T extends Human>T createHuman(Class c){
        Human human = null;
        try {
            human=(Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
