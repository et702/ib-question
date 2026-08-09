package Due_8_6;

/*
 * TODO: Question 15(f)
 *
 * Construct the PremiereScreening class.
 *
 * It must:
 * - inherit from Screening
 * - contain guestSpeaker
 * - contain additionalFee
 * - use super(...) in its constructor
 */

public class PremierScreening {
    
    private String guestSpeaker;
    private double additionalFee;

    public PremiereScreening(String screeningID, Film film, Venue venue, String guestSpeaker, double additionalFee)
    {
        super(screeningID, film, venue);
        this.guestSpeaker = guestSpeaker;
        this.additionalFee = additionalFee;
    }
}

