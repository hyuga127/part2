package compositePattern;

public class main {
    public static void main(String[] args) {
        Product coffee = new Product("Coffee", 30000);
        Product tea = new Product("Tea", 25000);
        Product water = new Product("Water", 10000);

        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(tea);

        Table table2 = new Table();
        table2.addProduct(coffee);
        table2.addProduct(water);

        CoffeeShop shop = new CoffeeShop();
        shop.addTable(table1);
        shop.addTable(table2);

        // In tổng doanh thu quán
        System.out.println("Total Revenue: " + shop.getPrice());
    }
}
