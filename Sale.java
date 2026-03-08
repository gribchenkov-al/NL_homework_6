public class Sale extends Deal {
    public String itemName;
    public int price;


    public Sale(String itemName,int price)
    {
        super("Продажа " + itemName + " на " + price + " руб.",0,price);
        this.itemName = itemName;
        this.price = price;
    }
}
