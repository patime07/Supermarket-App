package supermarket;

public class GroceryProduct {
    //fields
    private String name;
    private double price;
    private double discount; //as a %
    //constructor
    public GroceryProduct(String name, double price, double discount){
        this.name = name;
        this.price=price;
        this.discount=discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double discount){
        this.discount=discount;
    }

    public double productPrice(){
        double actualPrice = price-(price*discount/100);
        return actualPrice;
    }

    @Override
    public String toString() {
        return
                "Name : " + name +"\n"+
                "Price : " + price +"\n"+
                "Discount : " + discount +"\n"+
                "After Discount : " + productPrice();
    }
}
