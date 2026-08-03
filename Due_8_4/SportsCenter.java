package Due_8_4;

public class SportsCenter
{
    private Activity[] allActivities;
    private int numberOfActivities;

    public SportsCenter()
    {
        allActivities = new Activity[30];
        numberOfActivities = 0;
    }

    public int getNumberOfActivities()
    {
        return numberOfActivities;
    }

    public Activity getActivity(int index)
    {
        if (index >= 0 && index < numberOfActivities)
        {
            return allActivities[index];
        }

        return null;
    }

    /*
     * Question 17(a)
     *
     * Write addActivity() here.
     */

    /*
     * Question 17(b)
     *
     * Write findActivity() here.
     */

    /*
     * Question 17(c)
     *
     * Write countAffordable() here.
     */

    /*
     * Question 17(d)
     *
     * Write calculateAveragePrice() here.
     */

    /*
     * Question 18(a)
     *
     * Write getAffordableActivities() here.
     */

    /*
     * Question 18(b)
     *
     * Write getAvailableActivities() here.
     */

    /*
     * Question 19(a)
     *
     * Write swap() here.
     */

    /*
     * Question 19(b)
     *
     * Write sortByPrice() here.
     */

    public void displayAllActivities()
    {
        for (int i = 0; i < numberOfActivities; i++)
        {
            System.out.println(allActivities[i]);
        }
    }
}