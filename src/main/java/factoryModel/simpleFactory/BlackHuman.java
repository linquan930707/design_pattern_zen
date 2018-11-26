package factoryModel.simpleFactory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑颜色");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
