import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Dog dog;
    DogBed dogBed;
    DogFood dogFood;
    TenPerCentDiscount tenPerCentDiscount;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        dog = new Dog("Boxer", 400.00);
        dogBed = new DogBed("Comfort Plus", 45.00);
        dogFood = new DogFood("Royal Canin Boxer", 50.00);
        tenPerCentDiscount = new TenPerCentDiscount();
    }

    @Test
    public void canGetItemName(){
        assertEquals("Boxer", dog.getName());
    }

    @Test
    public void canSetName(){
        dog.setName("Jack Russell");
        assertEquals("Jack Russell", dog.getName());
    }

    @Test
    public void canGetItemPrice(){
        assertEquals(50.00,dogFood.getPrice(),.05);
    }

    @Test
    public void canSetPrice(){
        dogBed.setPrice(70.00);
        assertEquals(70.00, dogBed.getPrice(), .05);
    }

    @Test
    public void canAddItem(){
        shoppingBasket.addItem(dogBed);
        assertEquals(1, shoppingBasket.itemsInBasket());
    }

    @Test
    public void canRemoveItem(){
        shoppingBasket.addItem(dogBed);
        shoppingBasket.addItem(dogFood);
        assertEquals(2, shoppingBasket.itemsInBasket());
        shoppingBasket.removeItem(dogFood);
        assertEquals(1, shoppingBasket.itemsInBasket());
    }

    @Test
    public void canEmptyBasket(){
        shoppingBasket.addItem(dog);
        shoppingBasket.addItem(dogFood);
        shoppingBasket.emptyBasket();
        assertEquals(0,shoppingBasket.itemsInBasket());
    }

    @Test
    public void canGetReceiptTotal(){
        shoppingBasket.addItem(dogBed);
        shoppingBasket.addItem(dog);
        shoppingBasket.addItem(dogFood);
        assertEquals(495.00, shoppingBasket.receiptTotal(), .05);
    }

    @Test
    public void canGetTenPerCentDiscount(){
        shoppingBasket.addItem(dog);
        shoppingBasket.addItem(dogFood);
        tenPerCentDiscount.appliedDiscount(shoppingBasket.getShoppingItems());
        assertEquals(405.00,shoppingBasket.receiptTotal(),.05);
    }
}
