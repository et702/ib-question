package Nov24;

public class TripAllocator {
    private Trip[] allTrips = new Trip[16];

    // trips are stored in the ascending order of the trip number
    private Student[] allStudents = new Student[250];

    public void assignTrip(Student s) // assigns a trip to a student
    {
        int i = 0;
        boolean isDone = false;
        while (!isDone && i < 10) {
            // 제일 앞에 있는거 부터 돌리면서 그 trip이 running 중이라면, 걔를 assign. 아니라면 다음걸로 넘어가기
            int n = s.sPreferenceList[i];
            if (allTrips[n - 1].getPlacesFilled() < 25) {
                s.setTripAssigned(allTrips[n - 1].getTripTitle());
                allTrips[n - 1].updatePlacesFilled();
                allTrips[n - 1].addStudentToTripList(s);
                isDone = true;
            }
            i++;
        }
    }

    public void displayPlacesLeft() {
        
    }

    public int noTrip() {
        int noTripCount = 0;
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getTripAssigned().equals("zzz")) {
                noTripCount++;
            }
        }
        return noTripCount;
    }
}