package observerupgrade.impl;

import observerupgrade.Observer;

/**
 * @author joqk
 * @Date 2018/1/18 23:39
 * @{description} xxxxx
 **/
public class Wangwu implements Observer {

    public void update(String context) {
        System.out.println("王五：看到韩非子活动，自己也开始活动。。");
        this.cry(context);
        System.out.println("王五哭死了。");
    }

    private void cry(String context) {
        System.out.println("因为：" + context + "所以悲伤痛苦。。。");
    }
}
