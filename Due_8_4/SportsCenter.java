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

    /*
    (b) Construct getAffordableActivities. Create a new Activity array of length 30 and copy into it
    every activity whose price is less than or equal to maximumPrice. Store matches from index 0 onwards
    and return the new array. Unused positions may contain null.
     */

    public Activity[] getAffordableActivities(double maximumPrice) {
        // Create a new Acitivity array of length 30
        Activity[] result = new Activity[30];
        int resultIndex = 0;
        for (int i = 0; i < numberOfActivities; i++) {
            if (allActivities[i].getPrice() <= maximumPrice) {
                result[resultIndex] = allActivities[i];
                resultIndex++;
            }
        }
        return result;
    } 

    public Activity[] getAvailableActivities() {
        Activity[] result = new Activity[30];
        int resultIndex = 0;

        for (int i = 0; i < numberOfActivities; i++) {
            if (allActivities[i].hasSpace()) {
                result[resultIndex] = allActivities[i];
                resultIndex++;
            }
        }
        return result;
    }

    private void swap(int first, int second)
    {
        Activity temporary = allActivities[first];
        allActivities[first] = allActivities[second];
        allActivities[second] = temporary;
    }

    // [5,3,8,1,2]
    // 첫 번째 반복: [1,3,8,5,2]
    // 두 번째 반복: [2,8,5,3]
    // 세 번째 반복: [3,5,8]
    // 네 번째 반복: ..
    // [정렬 완료 부분 | 아직 정렬되지 않은 부분]
    // 매 반복마다: 정렬되지 않은 부분에서 최솟갑 찾기 --> 최솟값 위치 기억 --> 정렬되지 않은 부분의 첫 번째 값과 교환 --> 정렬 완료 부분이 한 칸 늘어남.

    public void selectionSort() {
        int[] nums = {5,3,8,1,2};
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
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



