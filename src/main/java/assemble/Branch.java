package assemble;

import java.util.ArrayList;

/**
 * Branch
 *
 * @author joqk
 * @Date 2018 2018/1/21 23:04
 **/
public class Branch extends Corp {

    /**
     * 领导下面有哪些下级和小兵
     */
    ArrayList<Corp> suordinateList = new ArrayList<Corp>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
            this.suordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return this.suordinateList;
    }

}
