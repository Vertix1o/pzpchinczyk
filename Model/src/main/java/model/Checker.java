package model;

import java.util.List;

public class Checker {
    private Player idWon = null;

    public Checker() {
    }

    public Player getIdWon() {
        return idWon;
    }

    public void checkWin(List<Player> player){
        for (Player x:player) {
            if(x.getFinishList().size() == 4){
                idWon = x;
            }
        }
    }

}
