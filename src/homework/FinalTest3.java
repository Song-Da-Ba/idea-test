
package homework;
import java.util.*;
class Vehicle{
    private int wheels;
    private double weight;
    public Vehicle(int wheels,double weight){
        this.wheels = wheels;
        this.weight = weight;
    }
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void show(){
        System.out.printf("有%d个轮子，重量为%.1f吨",wheels,weight);
    }
}
class Car extends Vehicle{
    private int loader;

    public Car(int wheels, double weight,int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public void show(){
        System.out.printf("有%d个轮子，重量为%.2f吨,载人%d位",this.getWheels(),this.getWeight(),loader);
    }
}

public class FinalTest3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入小车的轮胎个数");
        int wheels = input.nextInt();
        System.out.println("输入小车的重量");
        float weight = input.nextFloat();
        System.out.println("输入小车载人数");
        int loader = input.nextInt();
        Vehicle carinfo = new Car(wheels,weight,loader);
        carinfo.show();

    }

}
