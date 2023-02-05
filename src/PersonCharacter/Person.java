package PersonCharacter;

import java.io.LineNumberReader;

public abstract  class Person  implements Payable {
    private  String name;
    private  String surname;

    private  int  age;

    private  int id ;
    private static  int id_gen = 1;
    public  Person (){
        id = id_gen++;
    }
    public Person (String name , String surname , int  age){
        this();
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public void setAge (int age){
     this.age =  age;
    }
    public int getAge (){
        return age;
    }
    public  void setName(String name){
     this.name =  name;
    }
    public  String getName (){
        return  name;
    }
    public  void setSurname (String surname){
        this.surname  =surname;
    }
    public  String getSurname (){
        return  surname;
    }

    @Override
    public String toString() {
        return  id + " " +  name + " " +  surname + " " + age;
    }
}
