package builder.model;

/**
 * @author joqk
 * @{Name}
 * @Date 2018/1/20 22:27
 **/
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马启动。。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止。。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛。。。呼呼呼。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎启动。。。呼呼呼。。。。");
    }
}
