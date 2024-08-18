package supermarket;

public class DairyProduct extends GroceryProduct {
    private Fat fat;

    //constructor
    public DairyProduct(String name, double price, double discount, Fat fat) {
        super(name, price, discount);
        this.fat = fat;
    }

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return (super.toString()+"\nFat:"+fat);
    }
}
