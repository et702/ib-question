package Due_8_16;

public class Performance
{
    private String performer;
    private int audience;
    private double ticketPrice;

    public Performance(String performer,
                       int audience,
                       double ticketPrice)
    {
        this.performer = performer;
        this.audience = audience;
        this.ticketPrice = ticketPrice;
    }

    public String getPerformer()
    {
        return performer;
    }

    public int getAudience()
    {
        return audience;
    }

    public double getTicketPrice()
    {
        return ticketPrice;
    }
}