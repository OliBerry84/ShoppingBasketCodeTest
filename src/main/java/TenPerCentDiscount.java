import java.util.ArrayList;

public class TenPerCentDiscount implements IDiscounts{

    Items items;
    ShoppingBasket shoppingBasket;

    public ArrayList<Items> appliedDiscount(ArrayList<Items> shoppingItems) {

        double receiptTotal = 0;
        for(Items items : shoppingItems){
            receiptTotal += items.getPrice();
        }

        if (receiptTotal > 20){
            for(Items items : shoppingItems){
                double discountedPrice = items.getPrice() * 0.9;
                items.setPrice(discountedPrice);
            }
        }
        return shoppingItems;
    }
}
