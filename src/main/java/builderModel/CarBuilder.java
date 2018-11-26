package builderModel;


import java.util.ArrayList;

public abstract class CarBuilder {
    //设置启动方式
    public  abstract void setSequence(ArrayList<String>sequence);

    //获取汽车模型
    public abstract CarModel getCarModel();


}
