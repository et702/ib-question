package Due_8_16;

public class TicketStatistics
{
    private int[] ticketsSold;

    public TicketStatistics(int[] ticketsSold)
    {
        this.ticketsSold = ticketsSold;
    }

    public int totalRecursive(int index)
    {
        if (index == ticketsSold.length)
        {
            return 0;
        }

        return ticketsSold[index] + totalRecursive(index + 1);
    }

    // totalRecursive(0) ==> ticketsSold[0] + totalRecursive(1)
    // totalRecursive(1) ==> ticketsSold[1] + totalRecursive(2)
    // totalRecursive(2) ==> ticketsSold[2] + totalRecursive(3)...

    public int countAboveRecursive(int index,
                                   int target)
    {
        if (index == ticketsSold.length)
        {
            return 0;
        }

        if (ticketsSold[index] > target)
        {
            return 1 + countAboveRecursive(index + 1, target);  
        }

        return countAboveRecursive(index, target);
    }

    public int maximumRecursive(int index)
    {
        if (index == ticketsSold.length - 1)
        {
            return ticketsSold[index];
        }

        int maxOfRest = maximumRecursive(index + 1);
        if (ticketsSold[index] > maxOfRest)
        {
            return ticketsSold[index];
        }

        return maxOfRest;
    }
}