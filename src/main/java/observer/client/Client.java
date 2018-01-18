package observer.client;

import observer.impl.HanFeiZi;
import observer.impl.LiSi;
import observer.impl.Spy;

/**
 * @author joqk
 * @Date 2018/1/18 22:51
 * @{description} xxxxx
 **/
public class Client {

    public static void main(String[] args) throws InterruptedException {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();
        //观察早餐
        Spy watchBreakFast = new Spy(hanFeiZi, liSi,"breakfast");
        watchBreakFast.start();

        Spy watchFun = new Spy(hanFeiZi, liSi,"fun");
        watchFun.start();
//        Thread.sleep(1000);
        hanFeiZi.havaBreakfast();
//        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
