import taxes.TaxSystem;

public class Company {
    public String title;
    protected int debit;
    protected int credit;
    public TaxSystem taxSystem;

    public Company(String company, TaxSystem taxSystem) {
        this.title = company;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit = debit + amount;
        }
        if (amount < 0) {
            credit = credit + Math.abs(amount);
        }
        if (amount == 0) {

        }
    }

    public void payTaxes() {
        TaxSystem taxes = taxSystem;
        printTaxInfo(taxes.calcTaxFor(debit, credit));
        debit = 0;
        credit = 0;
    }


    public int applyDeals(Deal[] deals) {
        for (int i = 0; i < deals.length; i++) {
            Deal deal = deals[i];
            shiftMoney(deal.creditChange);
            shiftMoney(deal.debitChange);
        }
        int startDohodRashod = debit - credit;
        payTaxes();
        return startDohodRashod;

    }


    void printTaxInfo(int sum) {
        System.out.println("Компания " + title + " уплатила налог в размере " + sum + " Руб.");
    }

    public void setTaxSystem(TaxSystem newTaxSystem) {

        this.taxSystem = newTaxSystem;
        System.out.println("Поменяли систему налогообложения");

    }

    public String getTaxSystemString() {
        return taxSystem.getDescription();
    }


}
