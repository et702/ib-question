package Due_8_16;

public class Customer
{
    private String customerID;
    private String name;
    private int priority;

    public Customer(String customerID,
                    String name,
                    int priority)
    {
        this.customerID = customerID;
        this.name = name;
        this.priority = priority;
    }

    public String getCustomerID()
    {
        return customerID;
    }

    public String getName()
    {
        return name;
    }

    public int getPriority()
    {
        return priority;
    }
}