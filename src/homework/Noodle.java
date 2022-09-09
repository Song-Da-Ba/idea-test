package homework;
import java.util.Scanner;
public class Noodle {
    private String theMa;
    private int quantity;
    private boolean Soup;
    public Noodle(String theMa,int quantity,boolean Soup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.Soup = Soup;
    }
    public Noodle(String theMa,int quantity){
        this.theMa = theMa;
        this.quantity = quantity;
        this.Soup = false;
    }
    public Noodle(){
        this.theMa = "酸辣";
        this.quantity = 2;
        this.Soup = true;
    }
    public void check(){
        System.out.println("面码：" + theMa + "，粉的份量：" + quantity + "两，是否带汤：" + Soup);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String theMa = sc.next();
        int quantity = sc.nextInt();
        boolean Soup = sc.nextBoolean();
        Noodle noodle1 = new Noodle(theMa,quantity,Soup);
        Noodle noodle2 = new Noodle(theMa,quantity);
        Noodle noodle3 = new Noodle();
        noodle1.check();
        noodle2.check();
        noodle3.check();
    }
}
