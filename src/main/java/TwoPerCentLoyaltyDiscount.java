import java.util.ArrayList;

public class TwoPerCentLoyaltyDiscount implements IDiscounts {

    public ArrayList<Items> appliedDiscount(ArrayList<Items> shoppingItems) {

            for(Items items : shoppingItems){
                double discountedPrice = items.getPrice() * 0.98;
                items.setPrice(discountedPrice);
            }

            return shoppingItems;
        }
}

