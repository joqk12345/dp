package builder;

import java.util.ArrayList;

/**
 * @author joqk
 * @Date 2018/1/20 22:07
 * @{description} xxxxx
 **/
public abstract class CarModel {

    /**
     * 执行顺序的Command数组
     */
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract  void engineBoom();

    final public void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }


}
