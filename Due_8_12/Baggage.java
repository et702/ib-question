package Due_8_12;

public class Baggage
{
    private String baggageID;
    private double weight;
    private Flight flight;
    private boolean loaded;

    public Baggage(String baggageID,
                   double weight,
                   Flight flight)
    {
        this.baggageID = baggageID;
        this.weight = weight;
        this.flight = flight;
        loaded = false;
    }

    public String getBaggageID()
    {
        return baggageID;
    }

    public double getWeight()
    {
        return weight;
    }

    public Flight getFlight()
    {
        return flight;
    }

    public boolean isLoaded()
    {
        return loaded;
    }

    public void markLoaded()
    {
        loaded = true;
    }
}