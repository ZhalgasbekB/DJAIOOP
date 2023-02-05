package company.entities;

public class Product1 {
    private   int  id;
    private  String name;

    private   int count;
    public  Product1 (){}

    public  Product1 (String name , int count){
        setName1(name);
        setCount(count);
    }
    public  Product1 (int id, String name , int count){
        setId1(id);
        setName1(name);
        setCount(count);
    }
    public  void  setId1 (int id){
        this.id = id;
    }
    public  int getId (){
        return  id;
    }
    public  void setName1 (String name){
      this.name  = name ;
    }
    public String  getName1 (){
        return  name;
    }
    public   void setCount(int count){
        this.count = count;
    }
    public  int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Product1{" + " id= " + id +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}

