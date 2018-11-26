package AbstractFactory;

public abstract class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
