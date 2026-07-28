package OOP1;

public class Customer
{
    private int customerID;
    private String name;
    private Movie[] reservations;
    private int reservationCount;

    public Customer(int id, String name)
    {
        customerID = id;
        this.name = name;

        reservations = new Movie[5];
        reservationCount = 0;
    }

    public String getName()
    {
        return name;
    }

    public Movie[] getReservations()
    {
        return reservations;
    }

    public int getReservationCount()
    {
        return reservationCount;
    }

    public void increaseReservationCount()
    {
        reservationCount++;
    }
}