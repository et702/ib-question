public class Student {
    private String studentID;
    private String studentName;
    private int[] preferences;
    private String assignedActivity;

    public Student(String studentID, String studentName, int[] preferences) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.preferences = preferences;
        assignedActivity = "NONE";
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getPreference(int position) {
        return preferences[position];
    }

    public int getNumberOfPreferences() {
        return preferences.length;
    }

    public String getAssignedActivity() {
        return assignedActivity;
    }

    public void setAssignedActivity(String activityName) {
        assignedActivity = activityName;
    }
}
