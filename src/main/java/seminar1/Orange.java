package seminar1;

public class Orange extends Product {

    public Orange(String name, Double price, Long id) {
        super(name, price, id);
    }

    @Override
    public String toString() {
        return String.format("Апельсин: %s, %s, %s, ", getKind(), getPrice(), getId());
    }
}
