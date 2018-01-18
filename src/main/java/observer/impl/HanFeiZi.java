package observer.impl;

import observer.IHanFeizi;

/**
 * @author joqk
 * @Date 2018/1/18 22:34
 * @{description} xxxxx
 **/
public class HanFeiZi implements IHanFeizi {

    /**
     * 是否在吃饭，作为监控的判断依据
     */
    private boolean isHavingBreakfast = false;
    /**
     * 是否在娱乐，作为监控的判断依据
     */
    private boolean ishavingFun = false;

    /**
     * 要吃饭了
     */
    public void havaBreakfast() {
        System.out.println("韩非子在吃饭。。。");
        this.isHavingBreakfast = true;
    }

    public void haveFun() {
        System.out.println("韩非子在娱乐。。。");
        this.ishavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isIshavingFun() {
        return ishavingFun;
    }

    public void setIshavingFun(boolean ishavingFun) {
        this.ishavingFun = ishavingFun;
    }
}
