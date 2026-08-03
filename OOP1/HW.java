14 b)

public double getMaxWeight()
{
    return maxWeight;
}

15 a)
public Drone findDrone(int id)
{
    for (int i = 0; i < droneCount; i++)
    {
        if (drones[i].getDroneID() == id)
        {
            return drones[i];
        }
    }

    return null;
}

15 b) 
public void displayAvailableDrones()
{
    for (int i = 0; i < droneCount; i++)
    {
        if (drones[i].isAvailable())
        {
            System.out.println(
                drones[i].getDroneID() + " " + drones[i].getModel());
        }
    }
}

15 c) 
public int countExpressDrones()
{
    int count = 0;

    for (int i = 0; i < droneCount; i++)
    {
        if (drones[i] instanceof ExpressDrone)
        {
            count++;
        }
    }
}

18 a) 
public Drone largestDrone()
{
    Drone largest = drones[0];

    for (int i = 1; i < droneCount; i++)
    {
        if (drones[i].getMaxWeight() >
            largest.getMaxWeight())
        {
            largest = drones[i];
        }
    }
    return largest;
}

18 b) 
public int countHeavyDrones(double limit)
{
    int count = 0;

    for (int i = 0; i < droneCount; i++)
    {
        if (drones[i].getMaxWeight() > limit)
        {
            count++;
        }
    }
}
