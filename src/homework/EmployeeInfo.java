package homework;
import java.util.Scanner;
abstract class Employee{
    String name,sector;//定义姓名和部门
    float wage;//定义工资
    Employee(String name,String sector,float wage){
        this.name = name;
        this.sector = sector;
        this.wage = wage;
    }
    abstract public void showIncome();//显示月收入的抽象方法
}
//定义普通员工类
class BasicEmployee extends Employee{
    BasicEmployee(String name,String sector,float wage){
        super(name,sector,wage);
    }
    public void showIncome(){
        System.out.printf("我叫%s,在%s部门,我的本月收入是%.1f\n",name,sector,wage);
    }
}
//定义优秀员工类
class GoodEmployee extends Employee{
    float bonus;//定义奖金
    GoodEmployee(String name,String sector,float wage,float bonus){
        super(name,sector,wage);
        this.bonus = bonus;
        this.wage = bonus + wage;//收入:工资+奖金
    };
    public void showIncome(){
        System.out.printf("我叫%s,在%s部门,我的本月收入是%.1f",name,sector,wage);
    }
}
public class EmployeeInfo {
    public static void main(String[] args){
        Scanner basicEmployeeInfo = new Scanner(System.in);
        System.out.print("请输入普通员工姓名：");
        String bname = basicEmployeeInfo.next();
        System.out.print("请输入普通员工部门：");
        String bsector = basicEmployeeInfo.next();
        System.out.print("请输入普通员工工资：");
        float bwage = basicEmployeeInfo.nextFloat();
        BasicEmployee basicEmployee = new BasicEmployee(bname,bsector,bwage);
        basicEmployee.showIncome();


        Scanner goodEmployeeInfo = new Scanner(System.in);
        System.out.print("请输入优秀员工姓名：");
        String gname = goodEmployeeInfo.next();
        System.out.print("请输入优秀员工部门：");
        String gsector = goodEmployeeInfo.next();
        System.out.print("请输入优秀员工工资：");
        float gwage = goodEmployeeInfo.nextFloat();
        System.out.print("请输入优秀员工奖金：");
        float gbonus = goodEmployeeInfo.nextFloat();
        GoodEmployee goodEmployee = new GoodEmployee(gname,gsector,gwage,gbonus);
        goodEmployee.showIncome();
    }
}
