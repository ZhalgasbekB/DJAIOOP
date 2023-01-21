
import java.time.LocalDate;
public  abstract   class Product  {
    private String  name;
    private  double  storageLifeDays;
     private LocalDate deliveredAt;
     private String place;

     public Product(String name, double storageLifeDays, LocalDate deliveredAt, String place) {
         setName(name);
         setStorageLifeDays(storageLifeDays);
         setDeliveredAt(deliveredAt);
         setPlace(place);
     }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getStorageLifeDays() {
        return storageLifeDays;
    }

    public void setStorageLifeDays(double storageLifeDays) {
        this.storageLifeDays = storageLifeDays;
    }

    public void setDeliveredAt(LocalDate deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public LocalDate getDeliveredAt() {
        return deliveredAt;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public abstract boolean isFresh();

    @Override
    public String toString() {
        return "[" + name + " | " + deliveredAt + " | " + place + " | " + storageLifeDays + " | " + isFresh() + "]";
    }
}
