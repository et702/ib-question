package OOP2;

public class DeliveryCompany
{
    private Drone[] drones;
    private int droneCount;

    private Customer[] customers;
    private int customerCount;

    public DeliveryCompany()
    {
        drones = new Drone[100];
        droneCount = 0;

        customers = new Customer[50];
        customerCount = 0;
    }

    public void addDrone(Drone d)
    {
        drones[droneCount] = d;
        droneCount++;
    }

    public void addCustomer(Customer c)
    {
        customers[customerCount] = c;
        customerCount++;
    }

    public Drone[] getDrones()
    {
        return drones;
    }

    public int getDroneCount()
    {
        return droneCount;
    }

    // Question 15(a)
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

    // Question 15(b)
    public void displayAvailableDrones()
    {
        for (int i = 0; i < droneCount; i++)
        {
            if (drones[i].isAvailable())
            {
                System.out.println(
                    drones[i].getDroneID() + " "
                    + drones[i].getModel()
                );
            }
        }
    }

    // Question 15(c)
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

        return count;
    }

    // Question 16(a)
    public Drone assignParcel(Customer c, Parcel p)
    {
        for (int i = 0; i < droneCount; i++)
        {
            if (drones[i].isAvailable()
                    && drones[i].getMaxWeight() >= p.getWeight())
            {
                drones[i].assignDrone();

                Parcel[] customerParcels = c.getParcels();
                int nextPosition = c.getNumberOfParcels();

                customerParcels[nextPosition] = p;
                c.increaseCount();

                return drones[i];
            }
        }

        return null;
    }

    // Question 17
    public void displayDestinations()
    {
        String[] encountered = new String[80];
        int destinationCount = 0;

        for (int i = 0; i < customerCount; i++)
        {
            Parcel[] customerParcels =
                customers[i].getParcels();

            int parcelCount =
                customers[i].getNumberOfParcels();

            for (int j = 0; j < parcelCount; j++)
            {
                String destination =
                    customerParcels[j].getDestination();

                boolean alreadyFound = false;
                int k = 0;

                while (k < destinationCount
                        && !alreadyFound)
                {
                    if (encountered[k].equals(destination))
                    {
                        alreadyFound = true;
                    }

                    k++;
                }

                if (!alreadyFound)
                {
                    System.out.println(destination);

                    encountered[destinationCount] =
                        destination;

                    destinationCount++;
                }
            }
        }
    }

    // Question 18(a)
    public Drone largestDrone()
    {
        Drone largest = drones[0];

        for (int i = 1; i < droneCount; i++)
        {
            if (drones[i].getMaxWeight()
                    > largest.getMaxWeight())
            {
                largest = drones[i];
            }
        }

        return largest;
    }

    // Question 18(b)
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

        return count;
    }
}