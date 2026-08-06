package Due_8_6;

public class FestivalManager
{
    private Screening[] allScreenings;
    private int numberOfScreenings;

    public FestivalManager()
    {
        allScreenings = new Screening[50];
        numberOfScreenings = 0;
    }

    public boolean addScreening(Screening newScreening)
    {
        // TODO: Question 16(b)
        return false;
    }

    public Screening findScreeningByTitle(String searchTitle)
    {
        // TODO: Question 16(c)
        return null;
    }

    public Screening[] getAvailableScreenings()
    {
        // TODO: Question 16(d)
        return null;
    }

    private void swap(int first, int second)
    {
        // TODO: Question 16(e)
    }

    public void sortByTicketPrice()
    {
        // TODO: Question 16(f)
    }

    public int getNumberOfScreenings()
    {
        return numberOfScreenings;
    }

    public Screening getScreening(int index)
    {
        return allScreenings[index];
    }
}