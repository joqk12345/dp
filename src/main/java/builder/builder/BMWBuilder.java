package builder.builder;

import builder.model.BMWModel;
import builder.model.CarModel;

import java.util.ArrayList;

/**
 * @author joqk
 * @{Name}
 * @Date 2018/1/20 22:21
 **/
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
