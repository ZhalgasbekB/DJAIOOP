import java.time.LocalDate;
import java.util.Objects;

public class Fish extends  Product {
        public  Fish(String name, double storageLifeDays, LocalDate deliveredAt, String place){
            super(name, storageLifeDays,  deliveredAt, place);
        }

        @Override
       public  boolean isFresh(){
            LocalDate l = getDeliveredAt();
            LocalDate l1 = LocalDate.now();
            int lifeDays = (int) (Objects.equals(getPlace(), "IceBox")
                    ? getStorageLifeDays() : getStorageLifeDays() / 5);
            return l.plusDays(lifeDays).isAfter(l1);
        }


    @Override
    public String toString() {
        return  super.toString();
    }
}
