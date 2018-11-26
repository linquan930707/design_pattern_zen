package factoryModel.MultipleFactory;

public class Test {
    public static void main(String[] args) {
        Human BHuman = (new BlackHumanFactory()).createHuman();
        BHuman.getColor();
        BHuman.talk();
        Human WHuman = (new WhiteHumanFactory()).createHuman();
        WHuman.getColor();
        WHuman.talk();

    }
}
