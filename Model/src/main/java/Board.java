import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Field> board = new ArrayList<Field>();
    private List<Player> playerList = new ArrayList<Player>();

    public Board(int numberOfPlayer) {
        for(int i = 0; i < 40; i++){
            Field f = new Field(i);
            board.add(f);
        }
        for(int i = 0; i < numberOfPlayer; i++){
            Player p = new Player(i);
            playerList.add(p);
        }
    }

    public Field getBoard(int fieldNo) {
        return board.get(fieldNo);
    }

    public List<Field> getBoardList() {
        return board;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Player getPlayer(int index){
        return playerList.get(index);
    }
}
