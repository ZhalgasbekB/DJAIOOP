import java.time.LocalDate;
import java.util.Objects;

public class Stew extends Product {
    public  Stew (String name , double  storageLifeDays , LocalDate deliveredAt , String place){
        super(name, storageLifeDays , deliveredAt  , place);
    }

    @Override
    public boolean isFresh() {
        return true;
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
