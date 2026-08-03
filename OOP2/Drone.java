package OOP2;

public class Drone
{
    private int droneID;
    private String model;
    private double maxWeight;
    private boolean available;

    public Drone(int id, String model, double maxWeight)
    {
        droneID = id;
        this.model = model;
        this.maxWeight = maxWeight;
        available = true;
    }

    public int getDroneID()
    {
        return droneID;
    }

    public String getModel()
    {
        return model;
    }

    public double getMaxWeight()
    {
        return maxWeight;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void assignDrone()
    {
        available = false;
    }

    public void releaseDrone()
    {
        available = true;
    }
}