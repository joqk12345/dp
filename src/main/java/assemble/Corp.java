package assemble;

/**
 * Corp
 *
 * @author joqk
 * @Date 2018 2018/1/21 23:08
 **/
public abstract class Corp {
    /**
     * 姓名
     */
    private String name;
    /**
     * 职位
     */
    private String position;
    /**
     * 薪水
     */
    private int salary;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //获取小兵的信息
    public String getInfo() {
        String info = "";
        info = "姓名:"+this.name;
        info = info + "\t职位:"+this.position;
        info = info + "\t薪水:"+this.salary;
        return info;
    }

}
