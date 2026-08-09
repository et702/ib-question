package Due_8_6;

public class Screening
{
    private String screeningID;
    private Film film;
    private Venue venue;
    private int seatsBooked;

    public Screening(String screeningID, Film film, Venue venue)
    {
        this.screeningID = screeningID;
        this.film = film;
        this.venue = venue;
        this.seatsBooked = 0;
    }

    public boolean hasAvailableSeat()
    {
        if(seatsBooked < venue.getCapacity())
        {
            return true
        }
        else
        {
            return false;
        }
    }

    public boolean bookSeat()
    {
        if (hasAvailableSeat())
        {   
            seatsBooked++;
            return true;
        }
        else{
            return false;
        }
     
    }

    public Film getFilm()
    {
        return film;
    }

    public Venue getVenue()
    {
        return venue;
    }

    public int getSeatsBooked()
    {
        return seatsBooked;
    }

    public String getScreeningID()
    {
        return screeningID;
    }
}