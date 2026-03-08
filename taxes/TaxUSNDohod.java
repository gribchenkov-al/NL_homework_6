package taxes;

public class TaxUSNDohod extends TaxSystem {


    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }

}
