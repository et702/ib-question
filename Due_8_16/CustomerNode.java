package Due_8_16;

public class CustomerNode
{
    private Customer data;
    private CustomerNode next;

    public CustomerNode(Customer data)
    {
        this.data = data;
        this.next = null;
    }

    public Customer getData()
    {
        return data;
    }

    public CustomerNode getNext()
    {
        return next;
    }

    public void setNext(CustomerNode next)
    {
        this.next = next;
    }
}