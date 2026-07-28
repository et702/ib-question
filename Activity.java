public class Activity {
    private int activityNumber;
    private String activityName;
    private int maximumPlaces;
    private int placesFilled;
    private boolean available;

    public Activity(int activityNumber, String activityName, int maximumPlaces) {
        this.activityNumber = activityNumber;
        this.activityName = activityName;
        this.maximumPlaces = maximumPlaces;
        placesFilled = 0;
        available = true;
    }

    public int getActivityNumber() {
        return activityNumber;
    }

    public String getActivityName() {
        return activityName;
    }

    public int getMaximumPlaces() {
        return maximumPlaces;
    }

    public int getPlacesFilled() {
        return placesFilled;
    }

    public boolean isAvailable() {
        return available;
    }

    public void addStudent() {
        // code missing
    }
}
