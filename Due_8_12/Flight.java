package Due_8_12;

public class Flight
{
    private String flightCode;
    private String destination;
    private int maximumWeight;

    public Flight(String flightCode,
                  String destination,
                  int maximumWeight)
    {
        this.flightCode = flightCode;
        this.destination = destination;
        this.maximumWeight = maximumWeight;
    }

    public String getFlightCode()
    {
        return flightCode;
    }

    public String getDestination()
    {
        return destination;
    }

    public int getMaximumWeight()
    {
        return maximumWeight;
    }
}