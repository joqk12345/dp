package builder.model;

import builder.model.CarModel;

/**
 * @author joqk
 * @{Name}
 * @Date 2018/1/20 22:23
 **/
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎启动。。。。嗡嗡嗡。。");
    }
}
