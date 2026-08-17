package Due_8_16;

public class WaitingList {

    1 a)

    public void addToFront(Customer newCustomer)
    {
        CustomerNode newNode = new CustomerNode(newCustomer);
        newNode.setNext(head);
        head = newNode;
    }
    
    1 b) 
    public int countCustomers()
    {
        int count = 0;
        CustomerNode current = head;

        while (current != null)
        {
            count++;
        }

        return count;
    }

    1 c) 
    
    public Customer findCustomer(String searchID)
    {
        CustomerNode current = head;

        while (current != null)
        {
            if (current.getCustomerID().equals(searchID))
            {
                return current.getData();
            }

            current = current.getNext();
        }

        return null;
    }

    2)
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
    

}
