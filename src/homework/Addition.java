package homework;
import java.util.Scanner;
public class Addition {


    public int add(int a ,int b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public String add(String a ,String b){
        return a+b;
    }
    public static void main(String[] args) {
        Addition addition=new Addition();
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个字符串:");
        String a = s.next();
        System.out.print("请输入第二个字符串:");
        String  b = s.next();
        System.out.println("输入两个整数相加结果为:"+addition.add(a,b));
        System.out.print("请输入第一个整数:");
        int c = s.nextInt();
        System.out.print("请输入第二个整数:");
        int d = s.nextInt();
        System.out.println("输入两个整数相加结果为:"+addition.add(c,d));
        System.out.print("请输入第一个浮点数:");
        float e = s.nextFloat();
        System.out.print("请输入第二个浮点数:");
        float  f = s.nextFloat();
        System.out.println("输入两个整数相加结果为:"+addition.add(e,f));

    }
}