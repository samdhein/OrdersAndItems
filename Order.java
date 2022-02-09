import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    ArrayList<Item> items;

    public void updateTotal(){
        for (Item item: this.items){
            this.total += item.price;
        }
    }
}