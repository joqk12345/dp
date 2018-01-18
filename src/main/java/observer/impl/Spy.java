package observer.impl;

/**
 * @author joqk
 * @Date 2018/1/18 22:44
 * @{description} xxxxx
 **/
public class Spy extends Thread {
    /**
     * 间谍类的成员，韩非子
     */
    private HanFeiZi hanFeiZi;
    /**
     * 间谍类的成员，李斯
     */
    private LiSi liSi;
    /**
     * 监控类型
     */
    private String type;

    /**
     * 构造函数
     * @param hanFeiZi
     * @param liSi
     * @param type
     */
    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true){
            if(this.type.equals("breakfast")){
                    if(this.hanFeiZi.isHavingBreakfast()){
                        this.liSi.update("韩非子在吃饭");
                        //重置状态
                        this.hanFeiZi.setHavingBreakfast(false);
                    }
            }else {
                    if (this.hanFeiZi.isIshavingFun()){
                        this.liSi.update("韩非子在娱乐");
                        this.hanFeiZi.setIshavingFun(false);
                    }
            }
        }
    }
}
