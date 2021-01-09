public class Checker {
    private Player idWon = null;

    public Checker() {
    }

    public Player getIdWon() {
        return idWon;
    }

    void checkWin(Player player){
        if(player.getFinish().size() == 4){
            idWon = player;
        }
    }

}
