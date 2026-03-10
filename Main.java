import taxes.TaxUSNDohod;
import taxes.TaxUSNDohodRashod;


public class Main {
    public static void main(String[] args) {
        Company company = new Company("Сетевой дозор", new TaxUSNDohod());
        System.out.println(company.title);
        System.out.println("У компании система налогообложения " + company.getTaxSystemString());
        company.shiftMoney(2000);
        company.shiftMoney(-20000);
        company.payTaxes();

        Deal[] deals = {new Sale("Гайка", 200), new Sale("Болт", 200), new Sale("Мороженка", 200), new Expenditure("Сигареты", 100)};
        System.out.println("Разница между тратами и доходами до оплаты налогов " + company.applyDeals(deals));

        System.out.println("Поменяем систему налогообложения");
        company.setTaxSystem(new TaxUSNDohod());
        company.shiftMoney(2000);
        company.shiftMoney(-20000);
        company.payTaxes();


        System.out.println("________________________________ВТОРАЯ КОМПАНИЯ________________________________");


        Company company1 = new Company("Рога и копыта", new TaxUSNDohodRashod());
        System.out.println(company1.getTaxSystemString());
        System.out.println(company1.title);
        company1.setTaxSystem(new TaxUSNDohod());
        company1.shiftMoney(200);
        company1.shiftMoney(-2000);
        company1.payTaxes();


    }

}




