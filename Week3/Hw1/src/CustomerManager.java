public class CustomerManager {

    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager)
    {
        this.customer = customer;
        this.creditManager= creditManager;
    }
    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    public void Save(){
        System.out.println("Customer is saved.");
    }

    public void GiveCredit(){
        creditManager.Calculate();
        creditManager.Save();
    }
}
