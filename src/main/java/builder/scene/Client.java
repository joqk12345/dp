package builder.scene;

import builder.builder.BenzBuilder;
import builder.model.BMWModel;
import builder.model.BenzModel;

import java.util.ArrayList;

/**
 * Client
 *
 * @author joqk
 * @Date 2018 2018/1/20 22:32
 **/
public class Client {

    public static void main(String[] args) {
        // 奔驰车的执行顺序
        ArrayList<String> benzActionList = new ArrayList<String>();
        benzActionList.add("engine boom");
        benzActionList.add("start");
        benzActionList.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(benzActionList);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();
    }
}
