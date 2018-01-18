package observerupgrade.client;

import observerupgrade.impl.HanFeiZiPrimer;
import observerupgrade.impl.ZhaoGao;
import observerupgrade.Observer;
import observerupgrade.impl.Wangwu;

/**
 * @author joqk
 * @Date 2018/1/18 22:51
 * @{description} xxxxx
 **/
public class UpgradeClient {

    public static void main(String[] args) throws InterruptedException {
        Observer zhaoGao = new ZhaoGao();
        Observer wangWu = new Wangwu();

        HanFeiZiPrimer hanFeiZi = new HanFeiZiPrimer();
        hanFeiZi.addObserver(zhaoGao);
        hanFeiZi.addObserver(wangWu);

        hanFeiZi.havaBreakfast();

//        Thread.sleep(1000);
//        hanFeiZi.haveFun();
    }
}
