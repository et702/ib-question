package OOP1;

public class VIPMovie extends Movie {
    private boolean freeDrink;

    public VIPMovie(int id, String title, int duration, boolean drink) {
        super(id, title, duration);
        freeDrink = drink;
    }

    public boolean hasFreeDrink() {
        return freeDrink;
    }
}