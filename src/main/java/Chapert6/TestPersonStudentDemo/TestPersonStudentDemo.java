package Chapert6.TestPersonStudentDemo;
//子类的继承
class Person{
    String name;
    int age;
        }

class Student extends Person{
    String shool;
}
public class TestPersonStudentDemo {
    public static void main(String age[]){
        Student student =new Student();
        student.age=30;
        student.name="DD";
        student.shool="SD";
        System.out.println(student.age+student.name+student.age);
    }
}
