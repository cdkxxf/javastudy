package Chapert6.TestPersonStudentDemo4;

public class Student  extends Person{
    String shool;

    public Student(){
        //使用super调用父类的参数
        super("CD",31);
        System.out.println("Student 构造方法");
    }
}
