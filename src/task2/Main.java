package task2;

/**
 * Created by anton on 29.09.17.
 */
public class Main {
    public static void main(String[] args) {
        StationeryShop shop = new StationeryShop();
        shop.addPurchase(0, new Pen(3494.434));
        shop.addPurchase(0, new Notebook(0.5656));
        shop.addPurchase(1, new Notebook(45.67));
        System.out.println(shop.getAllPurchSum());
    }
}
