package seminar1;

public class HotDrink extends Product{

    public HotDrink(String kindNAme, Double volume, Long temperature) {
        super(kindNAme, volume, temperature);
    }
    @Override
    public String toString() {
        return String.format("Горячий напиток: %s, %s, %s, ", getKind(), getPrice(), getId());
    }
}
