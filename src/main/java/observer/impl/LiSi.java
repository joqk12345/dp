package observer.impl;

import observer.ILiSi;

/**
 * @author joqk
 * @Date 2018/1/18 22:40
 * @{description} xxxxx
 **/
public class LiSi implements ILiSi {

    public void update(String context) {
        System.out.println("李斯开始观察韩非子活动了，并且要汇报。。。");
        this.reporttoQinShiHuang(context);
        System.out.println("李斯汇报完毕。。。");
    }

    private void reporttoQinShiHuang(String reportContext) {
        System.out.println("报告老板！韩非子有活动----->"+reportContext);
    }
}
