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

        /*
        if (numberOfScreenings < allScreenings.length)
        {
            allScreenings[numberOfScreenings] = newScreening; 
            numberOfScreenings++;
            return true;
        }
        return false;
        
         */
        
    }

    public Screening findScreeningByTitle(String searchTitle)
    {
        for (int i = 0; i < numberOfScreenings; i++)
        {
            if (allScreenings[i].getFilm().getTitle().equalsIgnoreCase(searchTitle)) {
                return allScreenings[i];
            }
        }
        return null;
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

        return available;
    }

    private void swap(int first, int second)
    {
        Screening temp = allScreenings[first];
        allScreenings[first] = allScreenings[second];
        allScreenings[second] = temp;
    }

    public void sortByTicketPrice()
    {
        for (int i = 0; i < numberOfScreenings - 1; i++)
        {
            int lowest = i;

            for (int j = i + 1; j < numberOfScreenings; j++)
            {
                if (allScreenings[j].getFilm().getTicketPrice() 
                    < allScreenings[lowest].getFilm().getTicketPrice()) {
                        lowest = j;
                }
            }
            swap(i, lowest);
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