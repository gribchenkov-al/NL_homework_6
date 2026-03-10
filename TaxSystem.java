package taxes;

public abstract class TaxSystem {
    public int calcTaxFor(int debit, int credit) {
        return 0;
    }

    public abstract String getDescription();


}
