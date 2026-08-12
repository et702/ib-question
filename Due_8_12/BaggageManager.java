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
        double total = 0.0;
        for (int i = 0; i < numberOfBags; i++)
        {
            if (allBaggage[i].getFlight().getFlightCode().equals(flightCode))
            {
                total += allBaggage[i].getWeight();
            }
        }

        return total;
    }

    public Baggage[] getOverweightBaggage()
    {
        Baggage[] overweight = new Baggage[200];
        int count = 0;


        for (int i = 0; i < numberOfBags; i++)
        {
            if (allBaggage[i].getWeight() > allBaggage[i].getFlight().getMaximumWeight())
            {
                overweight[count] = allBaggage[i];
                count++;
            }
        }
        return overweight;
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
        if (index >= numberOfBags) {
            return 0;
        }
        if (!allBaggage[index].isLoaded()) {
            return 1 + countUnloaded(index + 1);
        }

        return countUnloaded(index + 1);
    }
}