package homework;

public class ForTest {
    public static void main(QString[] args) {

        // 请在 Begin-End 间编写代码

        /********** Begin **********/
        // 第一步：使用for循环依次取999到100中的每个数，判断是否为水仙花数
        int a;
        for(a=999;a>=100;a--){
            int bai =a/100;
            int shi =(a-bai*100)/10;
            int ge = a%10;
            if(bai*bai*bai+shi*shi*shi+ge*ge*ge==a){
                System.out.print(a+"是一个水仙花数。\n");
            }
        }
        // 第二步：获取个位

        // 第三步：获取十位

        // 第四步：获取百位

        // 第五步：判断个位数的三次幂，十位数的三次幂，百位数的三次幂的和是否等于这个数本身，等于的话，输出该数

        /********** End **********/

    }
}
