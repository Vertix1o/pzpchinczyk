import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Pawn> pawn = new ArrayList<Pawn>();
    private boolean isOccupied;
    private int numberOf;

    public Field() {
    }

    public Field(int numberOf) {
        this.numberOf = numberOf;
    }

    public Pawn getPawn(int index) {
        return pawn.get(index);
    }

    public List<Pawn> getPawnList() {
        return pawn;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public int getPawnColor(int index){
        return pawn.get(index).getColor();
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
