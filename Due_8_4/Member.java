package Due_8_4;

public class Member
{
    private String memberID;
    private String memberName;
    private Activity bookedActivity;

    /*
     * Question 15(a)
     *
     * Write the constructor here.
     */

    public String getMemberID()
    {
        return memberID;
    }

    public String getMemberName()
    {
        return memberName;
    }

    /*
     * Question 15(b)
     *
     * Write makeBooking() here.
     */

    /*
     * Question 15(c)
     *
     * Write getBookedActivity() here.
     */

    /*
     * Question 15(d)
     *
     * Write cancelBooking() here.
     */

    @Override
    public String toString()
    {
        return memberID + " - " + memberName;
    }
}