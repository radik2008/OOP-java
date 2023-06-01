package seminar1;

public class Main {
    public static void main(String[] args) {
        Vending vending = new FrufVending();
        System.out.println();
        Product product1 = new Apple("Apple", 20.0, 2L);
        Product product2 = new Banana("Banana", 25.0, 3L);
        Product product3 = new Orange("Orange", 30.0, 5L);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Cherry"));
        System.out.println(vending.getProduct("Banana"));

        System.out.println("");

        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));
        System.out.println(vending.getProduct(1L));

        System.out.println("");

        HotDrinkVending hotDrinkVending = new HotDrinkVending();
        HotDrink coffee = new HotDrink("Coffee", 0.5, 45L);
        HotDrink tea = new HotDrink("Tea", 0.7, 55L);
        HotDrink chocolate = new HotDrink("Chocolate", 0.3, 75L);
        hotDrinkVending.addProduct(coffee);
        hotDrinkVending.addProduct(tea);
        hotDrinkVending.addProduct(chocolate);
        System.out.println(hotDrinkVending.getProduct("Chocolate"));
        System.out.println(hotDrinkVending.getProduct("Tea"));
        System.out.println(hotDrinkVending.getProduct("Coffee"));

    }
}
