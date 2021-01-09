import java.util.Random;

public class Move {
    private Board board;
    private Random random = new Random();

    public Move(Board board) {
        this.board = board;
    }

    public int roll(){
        return random.nextInt(6) + 1;
    }

    //Trzeba stworzyć funkcje sprawdzającą czy field jest poprawny bo tu założyłe że jest!!!
    void moveMain(Field field, int diceRoll){
        //warunek przjścia pionka na metę
        if(field.getPawn(0).getTraveled()+diceRoll >= 40){
            board.getPlayer(field.getPawnColor(0)).getFinish().add(field.getPawn(0));
            field.setOccupied(false);
            field.getPawnList().remove(0);
        }else{
            if(field.getNumberOf() + diceRoll > 39){
                //zapętlenie listy
                diceRoll = diceRoll - (39 - field.getNumberOf()) - 1;
                move(field, diceRoll);
            }else {
                //nie zapętlanie
                diceRoll = diceRoll + field.getNumberOf();
                move(field, diceRoll);
            }
        }
    }

    private void move(Field field, int move){
        if(move == -1){
            move = 39;
        }
        if(isOccupied(move)){
            //sprawdzenie czy pole jest zajęte
            if(differentColor(field, move)) {
                //sprawdzenie czy zajęte przez przeciwny kolor
                if(MTO(move)){
                    //więcej niż jeden przeciwny pionek
                    moveMain(field, move);
                } else{
                    hit(field, move);
                }
            }else {
                //ten sam kolor
                setPawnOoField(field, move);
            }
        }else {
            //nie ma pionka na polu
            setPawnOoField(field, move);
        }
    }

    private void setPawnOoField(Field field, int move){
        board.getBoard(move).getPawnList()
                .add(field.getPawn(0));
        field.getPawnList().remove(0);
        if(field.getPawnList().size()==0) {
            field.setOccupied(false);
        }
    }

    private boolean differentColor(Field field, int move){
        if(board.getBoard(move).getPawn(0).getColor() != field.getPawn(0).getColor()){
            return true;
        }else {
            return false;
        }
    }

    private boolean isOccupied(int move){
        if(board.getBoard(move).isOccupied()){
            return true;
        }else {
            return false;
        }
    }

    private boolean MTO(int move){
        if(board.getBoard(move).getPawnList().size()>1) {
            return true;
        } else{
            return false;
        }
    }

    private void hit(Field field, int move){
        board.getPlayer(board.getBoard(move).getPawn(0).getColor())
                .setHome(board.getBoard(move).getPawn(0));
        board.getBoard(move).getPawnList().remove(0);
        board.getBoard(move).getPawnList().add(field.getPawn(0));
        field.getPawnList().remove(0);
        if(field.getPawnList().size()==0) {
            field.setOccupied(false);
        }
    }
}