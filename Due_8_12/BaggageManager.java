package Due_8_12;

public class BaggageManager
{
    private Baggage[] allBaggage;
    private int numberOfBags;

    public BaggageManager()
    {
        allBaggage = new Baggage[200];
        numberOfBags = 0;
    }

    public boolean addBaggage(Baggage bag)
    {
        // TO COMPLETE
        return false;
    }

    public Baggage findHeaviestBag(String destination)
    {
        // TO COMPLETE
        return null;
    }

    public double calculateTotalWeight(String flightCode)
    {
        // TO COMPLETE
        return 0;
    }

    public Baggage[] getOverweightBaggage()
    {
        // TO COMPLETE
        return null;
    }

    private void swap(int x, int y)
    {
        // TO COMPLETE
    }

    public void sortByWeight()
    {
        // TO COMPLETE
    }

    public int countUnloaded(int index)
    {
        // TO COMPLETE
        return 0;
    }
}