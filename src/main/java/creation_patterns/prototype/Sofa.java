package creation_patterns.prototype;

import java.awt.*;

public class Sofa extends Furniture{
    private int seats;
    private boolean recliner;

    public Sofa(String name, Dimensions dimensions, String material, Color color, int seats, boolean recliner) {
        super(name, dimensions, material, color);
        this.seats = seats;
        this.recliner = recliner;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isRecliner() {
        return recliner;
    }

    public void setRecliner(boolean recliner) {
        this.recliner = recliner;
    }
    @Override
    public String toString() {
        return super.toString() + " Seats: "+this.seats+" Has Recliner: "+this.recliner;
    }
}
