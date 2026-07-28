public class Movie
{
    private int movieID;
    private String title;
    private int duration;
    private boolean available;

    public Movie(int id, String title, int duration)
    {
        movieID = id;
        this.title = title;
        this.duration = duration;
        available = true;
    }

    public int getMovieID()
    {
        return movieID;
    }

    public String getTitle()
    {
        return title;
    }

    public int getDuration()
    {
        return duration;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void reserve()
    {
        available = false;
    }

    public void cancelReservation()
    {
        available = true;
    }
}