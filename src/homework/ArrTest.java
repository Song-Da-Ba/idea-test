package homework;
import java.util.Scanner;
public class ArrTest {


        public static void main(QString[] args) {
            // 请在Begin-End间编写代码
            /********** Begin **********/
            // 第一步：接收给定的第一个数，用于定义数组长度
            Scanner len = new Scanner(System.in);
            int num = len.nextInt();
            // 第二步：定义数组
            int [] score = new int[num];
            int index = 0;
            double sum = 0;
            // 第三步：把成绩赋值给数组元素
            while (!len.hasNext("#"))
            {
                score[index] = len.nextInt();
                index++;
            }


            // 第四步：求所有成绩的和
            for(int e:score){
                sum+=e;
            }

            // 第五步：求平均成绩
            System.out.println("数学平均成绩为："+sum/score.length);
            /********** End **********/
        }


}
