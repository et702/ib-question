public Activity(String activityCode, String activityName,
                double price, int maximumPlaces)
{
    this.activityCode = activityCode;
    this.activityName = activityName;
    this.price = price;
    this.maximumPlaces = maximumPlaces;
    this.placesBooked = 0;
}


public String getActivityName()
{
    return activityName;
}

public double getPrice()
{
    return price;
}

public boolean hasSpace()
{
    return placesBooked < maximumPlaces;
}

public boolean bookPlace()
{
    if (hasSpace())
    {
        placesBooked++;
        return true;
    }
    return false;
}

