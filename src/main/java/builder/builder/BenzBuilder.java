package builder.builder;

import builder.model.BenzModel;
import builder.model.CarModel;

import java.util.ArrayList;

/**
 * @author joqk
 * @{Name}
 * @Date 2018/1/20 22:30
 **/
public class BenzBuilder extends CarBuilder {

    /**
     * 构造一个奔驰模型
     */
    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
            this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
