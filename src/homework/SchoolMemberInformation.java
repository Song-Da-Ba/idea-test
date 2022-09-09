package homework;
interface StudentManageInterface{
    void setFee(int fee);//设置学生的每学期的学费
    int getFee();//获取学生的每学期的学费
}
interface TeacherManageInterface{
    void setPay(int pay);//设置教师的月工资
    int getPay();//获取教师的月工资
}
class Graduate implements StudentManageInterface,TeacherManageInterface{
    String name,sex;
    int fee,pay;
    Graduate(String name, String sex,int fee ,int pay){
        this.name = name;//名字
        this.sex = sex;//性别
        this.fee = fee;//每学期学费
        this.pay = pay;//月工资
    }

    @Override
    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public int getPay() {
        return pay;
    }
}
public class SchoolMemberInformation {
    public static void main(String [] args){
        Graduate graduate = new Graduate("张三","男",20000,4000);
        if(graduate.getPay()*12-graduate.getFee()<20000){
            System.out.println("需要贷款");
        }else {
            System.out.println("不需要贷款");
        }
    }
}

