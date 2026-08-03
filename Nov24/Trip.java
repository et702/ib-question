package Nov24;

import java.util.ArrayList;

public class Trip {
    private int tripNumber; // id of the trip
    private String tripTitle; // trip Name
    private String tripDesc; // trip description
    private int placesFilled; // number of places filled
    private boolean isRunning; // status of the trip
    private ArrayList<String> tList = new ArrayList<String>();

    public Trip(int tripNumber, String tripTitle, String tripDesc) {
        this.tripNumber = tripNumber;
        this.tripTitle = tripTitle;
        this.tripDesc = tripDesc;
        this.placesFilled = 0;
        this.isRunning = false;
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public ArrayList<String> getList() {
        return tList;
    }

    public int getPlacesFilled() {
        return placesFilled;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
    }

    public void updatePlacesFilled() {
        this.placesFilled++;

        // code missing to change the trip running status
    }

    public void addStudentToTripList(Student s) {
        tList.add(s.getName());
    }

    // all accessor and mutator methods are present but not shown
}// end of Trip class