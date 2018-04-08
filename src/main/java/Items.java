public abstract class Items {

    private String name;
    private double price;

    public Items(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(Double price){
        this.price = price;
    }
}