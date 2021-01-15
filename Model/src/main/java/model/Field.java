package model;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private Pawn pawn = null;
    private boolean isOccupied;
    private int numberOf;

    public Field() {
    }

    public Field(int numberOf) {
        this.numberOf = numberOf;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public int getPawnColor(){
        return pawn.getColor();
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
