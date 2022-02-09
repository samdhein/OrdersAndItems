import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2.99;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.50;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.50;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 9.95;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        System.out.println(order1.total);
        System.out.println(order2.name);
        
        order2.items = new ArrayList<Item>();
        order2.items.add(item1);
        order2.updateTotal();
        System.out.println(order2.total);

        order3.items = new ArrayList<Item>();
        order3.items.add(item4);
        order3.updateTotal();
        System.out.println(order3.total);

        order4.items = new ArrayList<Item>();
        order4.items.add(item2);
        order4.updateTotal();
        System.out.println(order4.total);

        order1.ready = true;
        System.out.println(order1.ready);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.updateTotal();
        System.out.println(order4.total);

        order2.ready = true;
        System.out.println(order2.ready);

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
