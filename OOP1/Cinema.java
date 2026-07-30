public Movie findMovie(int id)
{
    for(int i = 0; i < numberOfMovies; i++)
    {
        if(movies[i].getMovieID() == id)
        {
            return movies[i];
        }
    }
    return null;
}

public int countAvailableMovies()
{
    int count = 0;

    for(int i = 0; i < numberOfMovies; i++)
    {
        if(movies[i].isAvailable())
        {
            count++;
        }
    }

    return count;
}

public void displayAvailableMovies()
{
    for(int i = 0; i < numberOfMovies; i++)
    {
        if(movies[i].isAvailable())
        {
            System.out.println(movies[i].getTitle());
        }
    }
}

public void reserveMovie(Customer c, int movieID)
{
?
}

public boolean canReserve(Customer c)
{
    if(c.getReservationCount() < 5)
    {
        return true;
    }
    }
    else 
    {
        return false;
    }

public boolean canReserve(Customer c)
{
    if(c.getReservationCount() < 5)
    {
        return true;
    }

    else 
    {
        return false;
    }
}

public void displayReservations(Customer c)
{
    Movie[] reservations = c.getReservations();

    for(int i = 0; i < c.getReservationCount(); i++)
    {
        System.out.println(reservations[i].getTitle());
    }
}

