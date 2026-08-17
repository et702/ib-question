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
        performances[stage][timeSlot] = performance;

    }

    public int totalAudience()
    {
        int total = 0;
        for (int row = 0; row < performances.length; row++)
        {
            for (int col = 0; col < performances[row].length; col++)
            {
                if (performances[row][col] != null)
                {
                    total += performances[row][col].getAudience();
                }
            }
        }
        return total;
    }

    public Performance findMostPopular()
    {
        for (int row = 0; row < performances.length; row++)
        {
            for (int col = 0;
                 col < performances[row].length;
                 col++)
            {
                if? 
            }
        }
    }

    public int countPerformancesAbovePrice(double minimumPrice)
    {
    
        int count = 0;

        for (int row = 0; row < performances.length; row++)
        {
            for (int col = 0; col < performances[row].length; col++)
            {
                if (performances[row][col] != null && performances[row][col].getTicketPrice() > minimumPrice)
                {
                    count++;
                }
            }
        }

    }

    public int[] findPerformer(String performerName)
    {
        // TODO Question 4
        return null;
    }
}