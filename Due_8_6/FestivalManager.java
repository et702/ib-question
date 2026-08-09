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
        if (numberOfScreenings >= allScreenings.length)
        {
            return false;
        }
        else
        {
            allScreenings[numberOfScreenings] = newScreening; 
            numberOfScreenings++;
            return true;
        }
        
    }

    public Screening findScreeningByTitle(String searchTitle)
    {
        for (int i = 0; i < numberOfScreenings; i++)
        {
        //if (allScreenings[i].getFilm().get??

    }

    public Screening[] getAvailableScreenings()
    {
        Screening[] available = new Screening[50];
        int count = 0;

        for (int i = 0; i < numberOfScreenings; i++)
        {
            if (allScreenings[i].hasAvailableSeat())
            {
                available[count] = allScreenings[i];
                count++;
            }
        }
    }

    private void swap(int first, int second)
    {
        Screening temp = allScreenings[first];
        allScreenings[first] = allScreenings[second];
        allScreenings[second] = temp;
    }

    public void sortByTicketPrice()
    {
        for (int i = 0; i < numberOfScreenings; i++)
        {
            int lowest = i;

        for (int j = i + 1; j < numberOfScreenings; j++)
        {
            if (allScreenings[j].getFilm()
        }
    
        }
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