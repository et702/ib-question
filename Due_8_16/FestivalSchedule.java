package Due_8_16;

public class FestivalSchedule
{
    private Performance[][] performances;

    public FestivalSchedule()
    {
        performances = new Performance[4][5];
    }

    public void addPerformance(int stage,
                               int timeSlot,
                               Performance performance)
    {
        // TODO Question 3(a)
    }

    public int totalAudience()
    {
        // TODO Question 3(b)
        return 0;
    }

    public Performance findMostPopular()
    {
        // TODO Question 3(c)
        return null;
    }

    public int countPerformancesAbovePrice(double minimumPrice)
    {
        // TODO Question 3(d)
        return 0;
    }

    public int[] findPerformer(String performerName)
    {
        // TODO Question 4
        return null;
    }
}