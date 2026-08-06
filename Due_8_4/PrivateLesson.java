package Due_8_4;


public class PrivateLesson extends Activity
{
    private String instructorName;
    private double instructorFee;

    public PrivateLesson(String activityCode, String activityName, double price, int maximumPlaces, String instructorName, double instructorFee)
    {
        super(activityCode, activityName, price, maximumPlaces);
        this.instructorName = instructorName;
        this.instructorFee = instructorFee;
    }

    public double calculateFullPrice()
    {
        return getPrice() + instructorFee;
    }
}

