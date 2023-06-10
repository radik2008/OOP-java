package seminar1;

public class Orange extends Product {

    public Orange(String name, Double price, Long id) {
        super(name, price, id);
    }

    public Orange(){
        this("test", 0.5, 11L);
   }



    @Override
    public String toString() {
        return String.format("Апельсин: %s, %s, %s, ", getKind(), getPrice(), getId());
    }
}
