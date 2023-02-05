package People;

import PersonCharacter.Person;

public class Teenager extends Person {
    private  double grade ;

    public Teenager (String name , String surname , int age , double grade){
        super(name, surname , age);
        setGrade(grade);
    }
    public void setGrade(double grade){
     this.grade =  grade;
    }
    public  double getGrade(){
        return grade;
    }
    @Override
    public double geyPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Teenager[  " + super.toString() +  " ] " +  " grade: " + grade;
    }
}
