public class Expenditure extends Deal {
    public String itemName;
    public int price;

    public Expenditure(String itemName, int price) {
        super("Покупка " + itemName + " на " + price + " руб.", price, 0);
        this.itemName = itemName;
        this.price = price;

    }
}
