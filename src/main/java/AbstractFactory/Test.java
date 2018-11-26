package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        HumanFactory factory = new MaleFactory();
        Human blackHuman = factory.createBlackHuman();
        blackHuman.getColor();
        blackHuman.talk();
        blackHuman.getSex();
        HumanFactory factory1 = new FemaleFactory();
        Human blackHuman1 = factory1.createBlackHuman();
        blackHuman1.getColor();
        blackHuman1.talk();
        blackHuman1.getSex();
        /**
         * 白黄没实现
         */
    }
}
