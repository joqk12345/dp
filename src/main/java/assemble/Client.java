package assemble;

import java.util.ArrayList;

/**
 * Client
 *
 * @author joqk
 * @Date 2018 2018/1/21 23:11
 **/
public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        //get 员工信息
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree(){
        Branch root = new Branch("王大麻子","总经理",100000);

        Branch developDep = new Branch("刘大大","研发部门经理",10000);
        Branch salesDep = new Branch("马大大","销售部门经理",20000);
        Branch financeDep = new Branch("赵大大","财务部门经理",30000);

        Branch firstDevGroup = new Branch("小杨","开发一组组长",5000);
        Branch secondDevGroup = new Branch("吴大","开发二组组长",6000);

        //小兵
        Leaf leaf1 = new Leaf("1","开发人员",2000);
        Leaf leaf2 = new Leaf("2","开发人员",2000);
        Leaf leaf3 = new Leaf("3","开发人员",2000);
        Leaf leaf4 = new Leaf("4","开发人员",2000);
        Leaf leaf5 = new Leaf("5","开发人员",2000);
        Leaf leaf6 = new Leaf("6","开发人员",2000);
        Leaf leaf7 = new Leaf("7","开发人员",2000);
        Leaf leaf8 = new Leaf("8","销售人员",5000);
        Leaf leaf9 = new Leaf("9","销售人员",5000);
        Leaf leaf10 = new Leaf("10","财务人员",5000);
        Leaf laozheng = new Leaf("老郑","研发部副经理",20000);


        Leaf k = new Leaf("k","ceo秘书",8000);

        //ceo下 三个部门经理一个秘书
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        //研发部经理
        developDep.addSubordinate(laozheng);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);

        firstDevGroup.addSubordinate(leaf1);
        firstDevGroup.addSubordinate(leaf2);
        firstDevGroup.addSubordinate(leaf3);
        firstDevGroup.addSubordinate(leaf4);
        firstDevGroup.addSubordinate(leaf5);

        salesDep.addSubordinate(leaf8);
        salesDep.addSubordinate(leaf9);

        financeDep.addSubordinate(leaf10);
        return root;
    }
    // 遍历整颗树
    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for (Corp c :subordinateList){
            if(c instanceof Leaf){
                info = info + c.getInfo();
            }else {
                info = info + c.getInfo() + "\n" + getTreeInfo((Branch) c);
            }
        }
        return info;
    }
}
