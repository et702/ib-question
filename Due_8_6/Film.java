package Due_8_6;

public class Film
{
    
    private String filmCode;
    private String title;
    private String director;
    private int runningTime;
    private double ticketPrice;
    private boolean soldOut;

    public Film(String filmCode, String title,
                String director, int runningTime,
                double ticketPrice)
    {
        this.filmCode = filmCode;
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
        this.ticketPrice = ticketPrice;
        this.soldOut = false;
    }

    public String getTitle()
    {
        return title;
    }

    public double getTicketPrice()
    {
        return ticketPrice;
    }

    public boolean isSoldOut()
    {
        return soldOut;
    }

    public void setSoldOut()
    {
        soldOut = true;
    }

    // 14g)  Film openingFilm = new Film("F101", "The Last Signal", "Mina Park", 118, 14.50);
}
