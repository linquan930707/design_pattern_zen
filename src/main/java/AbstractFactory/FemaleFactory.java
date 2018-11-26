package AbstractFactory;

public class FemaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return null;
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
