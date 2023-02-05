package People;

import PersonCharacter.Person;

public  class Student  extends Person {

    private double  gpa;

    public Student (String name , String  surname , int age , double gpa){
        super(name , surname , age);
        setGpa(gpa);
    }
    public  void setGpa (double gpa){
        this.gpa =  gpa;
    }
    public double getGpa (){
        return  gpa;
    }

    @Override
    public double geyPaymentAmount() {
        return getGpa() < 2.67 ? 0 : 36660;
    }

    @Override
    public String toString() {
        return "Student[ " + super.toString() +  " ]" +" earns: "  + geyPaymentAmount();
    }
}