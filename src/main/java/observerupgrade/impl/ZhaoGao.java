package observerupgrade.impl;

import observerupgrade.Observer;

/**
 * @author joqk
 * @Date 2018/1/18 22:40
 * @{description} xxxxx
 **/
public class ZhaoGao implements Observer {

    public void update(String context) {
        System.out.println("赵高：观察到韩非子活动了，并且要汇报。。。");
        this.reporttoQinShiHuang(context);
        System.out.println("赵高汇报完毕。。。");
    }

    private void reporttoQinShiHuang(String reportContext) {
        System.out.println("报告老板！韩非子有活动----->"+reportContext);
    }
}
