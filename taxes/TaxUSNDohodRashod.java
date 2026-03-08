package taxes;

public class TaxUSNDohodRashod extends TaxSystem {
    public int calcTaxFor(int debit, int credit) {
        int taxCalc = debit - credit;
        if (taxCalc <= 0) {
            return (int) (Math.abs(debit * 0.01));
        } else {
            return (int) (taxCalc * 0.15);
        }

    }
}
