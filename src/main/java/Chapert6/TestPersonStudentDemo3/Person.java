package Chapert6.TestPersonStudentDemo3;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("Person 无参构造方法");
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person 有参构造方法");
    }

}
