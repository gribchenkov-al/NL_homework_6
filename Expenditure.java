public class Expenditure extends Deal {

    public Expenditure(String itemName, int price) {
        super("Покупка " + itemName + " на " + price + " руб.", price, 0);
    }
}
