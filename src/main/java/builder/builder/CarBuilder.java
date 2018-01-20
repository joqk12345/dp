package builder.builder;

import builder.model.CarModel;

import java.util.ArrayList;

/**
 * @author joqk
 * @Date 2018/1/20 22:06
 * @{description} xxxxx
 **/
public abstract class CarBuilder {

    /**
     * 构造执行顺序
     * @param sequence
     */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
     * 获取执行模型
     * @return
     */
    public abstract CarModel getCarModel();
}
