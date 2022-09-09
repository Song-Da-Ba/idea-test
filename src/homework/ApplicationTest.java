package homework;
import java.util.Scanner;
public class ApplicationTest {
    public static void main(QString[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        if(a>=65&& a<=90){
            System.out.print("该字符是大写字母");
        }
        else if(a>=97 && a<=122){
            System.out.print("该字符是小写字母");
        }
        else if(a>=48 && a<=57){
            System.out.print("该字符是数字");
        }
        else{
            System.out.print("该字符是其他字符");
        }
    }

}
