import java.util.ArrayList;

public class ShoppingBasket{

    private ArrayList<Items> shoppingItems;

    public ShoppingBasket(){
        this.shoppingItems = new ArrayList<>();
    }

    public ArrayList<Items> getShoppingItems(){
        return shoppingItems;
    }

    public void addItem(Items item){
        this.shoppingItems.add(item);
    }

    public void removeItem(Items item){
        this.shoppingItems.remove(item);
    }

    public void emptyBasket(){
        this.shoppingItems.clear();
    }

    public int itemsInBasket(){
        return shoppingItems.size();
    }

    public double receiptTotal(){
        double receiptTotal = 0;
        for (Items items : shoppingItems){
            receiptTotal += items.getPrice();
        }
        return receiptTotal;
    }

}
