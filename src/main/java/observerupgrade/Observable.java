package observerupgrade;

/**
 * @author joqk
 * @Date 2018/1/18 23:28
 * @{description} xxxxx
 **/
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String context);
}
