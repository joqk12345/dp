package observerupgrade.impl;

import observer.IHanFeizi;
import observerupgrade.Observable;
import observerupgrade.Observer;

import java.util.ArrayList;

/**
 * @author joqk
 * @Date 2018/1/18 22:34
 * @{description} xxxxx
 **/
public class HanFeiZiPrimer implements IHanFeizi , Observable {

    /**
     * 观察者数组，存放所有观察者
     */
    private ArrayList<Observer> observerArrayList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    public void notifyObservers(String context) {
        for (Observer observer : observerArrayList){
            observer.update(context);
        }
    }

    public void havaBreakfast() {
        System.out.println("韩非子在吃饭");
        this.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子在娱乐");
        this.notifyObservers("韩非子在娱乐。。");
    }
}
