package AbstractFactory;

public abstract class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄颜色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
