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

    public boolean addActivity(Activity newActivity)
    {
    if (numberOfActivities < allActivities.length)
    {
        allActivities[numberOfActivities] = newActivity;
        numberOfActivities++;
        return true;
    }
    return false;
    }

    public Activity findActivity(String searchName)
    {
    for (int i = 0; i < numberOfActivities; i++)
    {
        if (allActivities[i].getActivityName().equalsIgnoreCase(searchName))
        {
            return allActivities[i];
        }
    }

    return null;
    }

    private void swap(int first, int second)
    {
        Activity temporary = allActivities[first];
        allActivities[first] = allActivities[second];
        allActivities[second] = temporary;
    }

    public void sortByPrice()
    {
        
    for (int current = 0; current < numberOfActivities - 1; current++)
    {
        int smallest = current;

        for (int check = current + 1; check < numberOfActivities; check++)
        {
            if (allActivities[check].getPrice() < allActivities[smallest].getPrice())
            {
                smallest = check;
            }
        }

        swap(current, smallest);
    }
    }


    public void displayAllActivities()
    {
        for (int i = 0; i < numberOfActivities; i++)
        {
            System.out.println(allActivities[i]);
        }
    }
}