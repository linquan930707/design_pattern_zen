package builderModel;

import java.util.ArrayList;

/**
 * 导演类
 */
public class Director {
    private ArrayList<String>sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getBenzModelOne(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("engine boom");
        sequence.add("alarm");
        sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    public BenzModel getBenzModelTwo(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getBMWModelOne(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("engine boom");
        sequence.add("alarm");
        sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }
    public BMWModel getBMWModelTwo(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }




}
