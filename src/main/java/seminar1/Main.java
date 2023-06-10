package seminar1;

import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {
        Vending vending = new FrufVending();
        System.out.println();
        Product product1 = new Apple("Apple", 20.0, 2L);
        Product product2 = new Banana("Banana", 25.0, 3L);
        Product product3 = new Orange("Orange", 30.0, 5L);
        Product product4 = new Orange();

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);
        vending.addProduct(product4);

        System.out.println(product4);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Cherry"));
        System.out.println(vending.getProduct("Banana"));

        System.out.println("");

        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));
        System.out.println(vending.getProduct(1L));

        System.out.println("");

        HotDrinkVending hotDrinkVending = new HotDrinkVending();
        HotDrink hotDrink1 = new HotDrink("Coffee", 3.5, 45L, 0.5, 50);
        HotDrink hotDrink2 = new HotDrink("Tea", 8.8, 46L, 0.7, 55);
        HotDrink hotDrink3 = new HotDrink("Chocolate", 90.3, 47L, 1.5, 60);
        hotDrinkVending.addProduct(hotDrink1);
        hotDrinkVending.addProduct(hotDrink2);
        hotDrinkVending.addProduct(hotDrink3);
        System.out.println(hotDrinkVending.getProduct("Chocolate"));
        System.out.println(hotDrinkVending.getProduct("Tea"));
        System.out.println(hotDrinkVending.getProduct("Coffee"));

        System.out.println(" ");
        System.out.println(hotDrink1.getPrice());
        System.out.println(product2.getPrice());

        hotDrink1.setFileHandler(new FileHandler1());
        hotDrink1.save();

        hotDrink1.setFileHandler(new FileHandler2());
        hotDrink1.save();

        hotDrink2.setFileHandler(new FileHandler2());
        hotDrink1.save();

//        File f = new File("C:\\Users\\RODION\\Documents\\Java_progect\\IDEA\\seminar1\\untitled1\\src\\main\\java\\seminar1\\file.txt");
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
//             ObjectInputStream ios = new ObjectInputStream(new FileInputStream(f))) {
//            oos.writeObject(hotDrink1);

    }


}

