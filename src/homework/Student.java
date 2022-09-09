package homework;
import java.util.Scanner;
public class Student {
    private String name;  // 学生的姓名
    private int id;  // 学生的学号信息
    private double score;  // 学生的成绩
    public  Student(){}
    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public  String  getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int  getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getScore(){
        return  score;
    }
    public void getScore(double score){
        this.score = score;
    }

    public static void sort(Student[]s){
        for (int i = 0 ;i<s.length-1;i++){
            if(s[i].score< s[i+1].score){
               Student temp = s[i];
                s[i] = s[i+1];
                s[i+1] = temp;
            }
        }
    }
    public void show(){
        System.out.println(name+" "+id+" "+score);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s[] = new Student[3];
        s[0] = new Student("wwd",01,80);
        s[1] = new Student("lj",02,100);
        s[2] = new Student("son",03,90);
        Student.sort(s);

        for(int i = 0;i<s.length;i++){
            s[i].show();
        }
    }
}






