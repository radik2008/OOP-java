package seminar1;

public class Apple extends Product {

    public Apple(String name, Double price, Long id) {
        super(name, price, id);
    }
    @Override
    public String toString() {
        return String.format("Яблоко: %s, %s, %s, ", getKind(), getPrice(), getId());
    }
}

