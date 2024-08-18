package supermarket;

public class Beverage extends GroceryProduct{
    private SugarLevel sugar;
    public Beverage(String name, double price, double discount, SugarLevel sugar){
        super(name, price, discount);
        this.sugar=sugar;
    }

    public SugarLevel getSugar() {
        return sugar;
    }

    public void setSugar(SugarLevel sugar) {
        this.sugar = sugar;
    }

    public String toString(){
        return (super.toString()+"\nSugar level:"+sugar);
    }




}
