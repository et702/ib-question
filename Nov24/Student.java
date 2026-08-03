package Nov24;

public class Student {
    private String sId; // unique id of the student
    private String fId; // unique id of the friend going jointly
    private String sName; // name of the student
    private int sGrade; // grade level of the student
    private String tripAssigned; // trip Title assigned to the student
    public int[] sPreferenceList = new int[10]; // preferred trip numbers

    public Student(String sID, String sName, int sGrade,
                   int[] sPreferenceList) {
        this.sId = sId;
        this.sName = sName;
        this.sGrade = sGrade;
        this.sPreferenceList = sPreferenceList;
        this.tripAssigned = "zzz";
    }

    public void setTripAssigned(String tripAssigned) {
        this.tripAssigned = tripAssigned;
    }

    public String getName() {
        return sName;
    }

    public String getTripAssigned() {
        return tripAssigned;
    }

    // all accessor and mutator methods are present but not shown
}// end of Student class