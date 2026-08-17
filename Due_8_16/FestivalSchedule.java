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
        Performance mostPopular = null;

        for (int row = 0; row < performances.length; row++)
        {
            for (int col = 0;
                 col < performances[row].length;
                 col++)
            {
                Performance current = performances[row][col];
                if (current.getAudience() > mostPopular.getAudience()) {
                    mostPopular = current;
                }
            }
        }
        return mostPopular;
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
        return count;
    }

    public int[] findPerformer(String performerName)
    {

        for (int row = 0; row < performances.length; row++)
        {
            for (int col = 0; col < performances[row].length; col++)
            {
                Performance current = performances[row][col];
                if (current.getPerformer().equals(performerName)) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}