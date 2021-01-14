package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final int color;
    private List<Pawn> home = new ArrayList<Pawn>();
    private List<Pawn> finish = new ArrayList<Pawn>();

    public Player(int color) {
        this.color = color;
        for(int i = 0; i < 4; i++){
            Pawn p = new Pawn(this.color);
            home.add(p);
        }
    }

    public int getColor() {
        return color;
    }

    public Pawn getHome(int index) {
        return home.get(index);
    }

    public List<Pawn> getFinish() {
        return finish;
    }

    public void setHome(Pawn p) {
        this.home.add(p);
    }

    public void setFinish(Pawn p) {
        this.finish.add(p);
    }
}
