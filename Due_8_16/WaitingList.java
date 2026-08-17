package Due_8_16;

public class WaitingList {

    //1 a)

    private CustomerNode head;

    public void addToFront(Customer newCustomer)
    {
        CustomerNode newNode = new CustomerNode(newCustomer);
        newNode.setNext(head);
        head = newNode;
    }
    
    // 1 b) 
    public int countCustomers()
    {
        int count = 0;
        CustomerNode current = head;

        while (current != null)
        {
            count++;
            current = current.getNext();
        }

        return count;
    }

    // 1c) 
    
    public Customer findCustomer(String searchID)
    {
        CustomerNode current = head;

        while (current != null)
        {
            if (current.getData().getCustomerID().equals(searchID))
            {
                return current.getData();
            }

            current = current.getNext();
        }

        return null;
    }

    // 2)
    public void addByPriority(Customer newCustomer)
    {
        CustomerNode newNode = new CustomerNode(newCustomer);

        if (head == null ||
            newCustomer.getPriority() > head.getData().getPriority())
        {
            newNode.setNext(head);
            head = newNode;
            return;
        }
    }

    public int countRecursive(CustomerNode current) {
        if (current == null) {
            return 0;
        }

        return 1 + countRecursive(current.getNext());
    }

    private int countHighPriority(CustomerNode current, int minimumPriority) {
        if (current == null) {
            return 0;
        }
        if (current.getData().getPriority() >= minimumPriority) {
            return 1 + countHighPriority(current.getNext(), minimumPriority);
        }

        return countHighPriority(current.getNext(), minimumPriority);
    }
    

}
