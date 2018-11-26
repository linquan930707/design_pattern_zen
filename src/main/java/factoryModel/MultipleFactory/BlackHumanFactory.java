package factoryModel.MultipleFactory;

public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return  new BlackHuman();
    }
}
