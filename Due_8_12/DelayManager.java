package Due_8_12;

import java.util.LinkedList;

public class DelayManager
{
    private LinkedList<DelayedBag> delayedBags;

    public DelayManager()
    {
        delayedBags = new LinkedList<DelayedBag>();
    }

    public void insertByDelay(DelayedBag newBag)
    {
        int index = 0;
        while (index < delayedBags.size() && delayedBags.get(index).getDelayMinutes()
                <= newBag.getDelayMinutes()) {
            index++;
        }

        delayedBags.add(index, newBag);
    }

    // 10 20 35 60 90
    
    public DelayedBag removeLongestDelay()
    {
        if (delayedBags.size() == 0) {
            return null;
        }

        return delayedBags.remove(delayedBags.size() - 1);
    }

    /*

    if (index >= numberOfBags) {
            return 0;
        }
        if (!allBaggage[index].isLoaded()) {
            return 1 + countUnloaded(index + 1);
        }

        return countUnloaded(index + 1);


     */
    public int countSevereDelays(int index)
    {
        if (index >= delayedBags.size()) {
            return 0;
        }

        if (delayedBags.get(index).getDelayMinutes() > 60) {
            return 1 + countSevereDelays(index + 1);
        }

        return countSevereDelays(index + 1);
    }
}