package homework;
import java.util.*;

public class Mean {
    public static  void  main(QString[] args){
        //输入十个整数求它们的平均值
        Scanner sc = new Scanner(System.in);
        int count =1;
        int sum = 0;
        float avg = 0;
        while(count<11){
            sum +=sc.nextInt();
            count++;
        }
        //平均值
        avg = sum/10;

    }
}
