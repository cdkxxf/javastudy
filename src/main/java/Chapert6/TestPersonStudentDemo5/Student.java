package Chapert6.TestPersonStudentDemo5;

public class Student extends Person {
    String shool;

    public Student(String name,int age,String shool){

        super.name=name;
        super.age=age;
        this.shool=shool;
        System.out.println("Student 有参构造方法");
        System.out.println(super.talk());
    }


}
