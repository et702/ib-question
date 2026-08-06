package Due_8_6;

public class Venue
{
    private String venueName;
    private int capacity;

    public Venue(String venueName, int capacity)
    {
        this.venueName = venueName;
        this.capacity = capacity;
    }

    public String getVenueName()
    {
        return venueName;
    }

    public int getCapacity()
    {
        return capacity;
    }
}