package homework;
import java.util.Scanner;
public class Person {
    String name ;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    static class Student extends Person {
        String school;
        Student(String name,int age,String school){
            super(name,age);
            this.school = school;
            System.out.printf("姓名：%s，年龄：%d，学校：%s",name,age,school);
        }
    }
    public static void main(String[ ] args){
        Scanner info = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = info.next();
        System.out.println("请输入年龄");
        int age = info.nextInt();
        System.out.println("请输入学校");
        String school = info.next();
        Student s = new Student(name,age,school);
    }
}

