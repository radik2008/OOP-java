package seminar1;

public class Banana extends Product{

    public Banana(String name, Double price, Long id) {
        super(name, price, id);
    }
    @Override
    public String toString() {
        return String.format("Банан: %s, %s, %s, ", getKind(), getPrice(), getId());
    }
}
