package seminar1;

public abstract class Product {
    private String kind;
    private Double price;
    private Long id;

    public Product(String kind, Double price, Long id) {
        this.kind = kind;
        this.price = price;
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

