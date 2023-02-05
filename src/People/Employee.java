package People;

import PersonCharacter.Person;

public class Employee extends Person {
    private String position;

    private double salary;


    public   Employee (String name  , String surname , int age  , double salary  , String position){
        super(name  , surname, age);
        setPosition(position);
        setSalary(salary);
    }
    public  void  setSalary (double salary){
        this.salary = salary;
    }
    public  double getSalary (){
        return  salary;
    }
    public  void setPosition (String position) {
        this.position = position;
    }
    public  String  getPosition (){
     return  position;
    }
    @Override
    public double geyPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[ " +super.toString() +  " ]" +   " position: " + getPosition() + ' ' + "earns: " + geyPaymentAmount();
    }
}
