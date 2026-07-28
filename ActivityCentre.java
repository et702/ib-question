public class ActivityCentre {
    private Activity[] allActivities;
    private Student[] allStudents;
    private int numberOfActivities;
    private int numberOfStudents;

    public ActivityCentre() {
        allActivities = new Activity[20];
        allStudents = new Student[300];
        numberOfActivities = 0;
        numberOfStudents = 0;
    }

    public void addActivity(Activity a) {
        allActivities[numberOfActivities] = a;
        numberOfActivities++;
    }

    public void addStudent(Student s) {
        allStudents[numberOfStudents] = s;
        numberOfStudents++;
    }

    public void displayAvailableActivities()
    {
        for (int i = 0; i < numberOfActivities; i++)
        {
            Activity activity = allActivities[i];
            if (activity.isAvailable())
            {
                int placesLeft = activity.getMaximumPlaces() - activity.getPlacesFilled(); //?????? 애매 
                System.out.println("Activity " + activity.getActivityNumber() + ": "+  activity.getActivityName()  + " Places left: " + placesLeft);
            }
        }
    }
}
