package builder.director;

import builder.builder.BMWBuilder;
import builder.builder.BenzBuilder;
import builder.model.BMWModel;
import builder.model.BenzModel;

import java.util.ArrayList;

/**
 * Director
 *
 * @author joqk
 * @Date 2018 2018/1/20 22:55
 **/
public class Director {

    /**
     * 装配者的执行顺序
     */
    private ArrayList<String> sequence = new ArrayList<String>();
    /**
     * 奔驰的建造者
     */
    private BenzBuilder benzBuilder = new BenzBuilder();
    /**
     * 宝马的构建者
     */
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.getABenzModel();
    }

    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
