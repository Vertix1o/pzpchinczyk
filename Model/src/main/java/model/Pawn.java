package model;

public class Pawn {
    private final int color;
    private int traveled = 0;

    public Pawn(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public int getTraveled() {
        return traveled;
    }

    public void setTraveled(int traveled) {
        this.traveled += traveled;
    }

}
