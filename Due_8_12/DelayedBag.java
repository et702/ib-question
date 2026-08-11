package Due_8_12;

public class DelayedBag
{
    private String baggageID;
    private int delayMinutes;

    public DelayedBag(String baggageID,
                      int delayMinutes)
    {
        this.baggageID = baggageID;
        this.delayMinutes = delayMinutes;
    }

    public String getBaggageID()
    {
        return baggageID;
    }

    public int getDelayMinutes()
    {
        return delayMinutes;
    }
}