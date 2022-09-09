package homework;
import java.util.Scanner;

public class FinalTest1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        if(score<0 || score>100){
            System.out.println("输入的成绩不合法！");
        }else{
            String temp = String.valueOf(score).substring(0,1);//将用户输入的成绩转为字符串&&切取下标为0的字符串赋值给temp
            if(score>=85){
                temp = "9";
            }else if(score>=80){
                temp = "7";
            }
            switch (temp){
                case ("9"):System.out.println("优");
                break;
                case ("7"):System.out.println("良");
                break;
                case ("6"):System.out.println("中");
                break;
                default:System.out.println("不及格");
            }
        }
    }
}
