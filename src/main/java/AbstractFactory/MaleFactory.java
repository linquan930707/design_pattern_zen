package AbstractFactory;

public class MaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
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
