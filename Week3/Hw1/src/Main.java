public class Main {
    public static void main(String[] args)
    {
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.setId(1);

        Company company= new Company();
        company.setCompanyName("Arcelik");
        company.setTaxNumber("1");


        CustomerManager cm = new CustomerManager(new Person());
        cm.Save();

        Person person = new Person();
        person.setFirstName("Mine");
        person.setLastName("Cakir");

        CustomerManager cm2 = new CustomerManager(new Customer(), new MilitaryCreditManager());
        cm2.GiveCredit();

    }
}
