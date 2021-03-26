package Chapert6.TestPersonStudentDemo5;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("Person 无参构造方法");
    }
    public String  talk(){
        return "talk 方法返回值："+this.age+this.name;
    }
}
