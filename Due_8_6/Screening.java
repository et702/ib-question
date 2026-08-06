package Due_8_6;

public class Screening
{
    private String screeningID;
    private Film film;
    private Venue venue;
    private int seatsBooked;

    public Screening(String screeningID, Film film, Venue venue)
    {
        // TODO: Question 15(c)
    }

    public boolean hasAvailableSeat()
    {
        // TODO: Question 15(d)
        return false;
    }

    public boolean bookSeat()
    {
        // TODO: Question 15(e)
        return false;
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