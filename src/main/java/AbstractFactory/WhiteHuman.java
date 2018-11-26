package AbstractFactory;

public abstract class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白颜色");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
