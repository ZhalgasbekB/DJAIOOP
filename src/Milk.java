public class Milk extends  Product  {
    private Store store =  new Store();

    @Override
    public boolean isFresh(){
        String place  =  store.getRandomStoragePlace();
        return place == "IceBox" ?  true  : false  ;
    }
    public Milk (){
        super("Milk" , 60 );
    }

}
