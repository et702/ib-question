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

    }

    public int countAboveRecursive(int index,
                                   int target)
    {
        if (index == ticketsSold.length)
        {
            return 0;
        }

        if (ticketsSold[index] > target)
        {
            ?
        }
    }

    public int maximumRecursive(int index)
    {
        if (index == ticketsSold.length - 1)
        {
            return ticketsSold[index];
        }

        if (ticketsSold[index] > maxOfRest)
        {
            return ticketsSold[index];
        }

        return maxOfRest;
    }
}