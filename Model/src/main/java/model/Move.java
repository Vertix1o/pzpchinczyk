package model;

import java.util.Random;

public class Move {
    private final Board board;
    private final Random random = new Random();

    public Move(Board board) {
        this.board = board;
    }

    public int roll(){
        return random.nextInt(6) + 1;
    }

    //Trzeba stworzyć funkcje sprawdzającą czy field jest poprawny bo tu założyłe że jest!!!
    // moveMain zwraca true jeżeli wykonał się ruch false jeżeli nie macie pole do popisu z tym
    //chhyba jest to w miarę dobrze jeszcze raz na to patrzyłem dzisiaj tj. 13.01.2021 i wydaje się być dorze
    public boolean moveMain(Field field, int diceRoll){
        //warunek przjścia pionka na metę
        if(diceRoll >= 1){
            if(field.getPawn().getTraveled()+diceRoll >= 40){
                board.getPlayer(field.getPawnColor()).getFinishList().add(field.getPawn());
                field.setPawn(null);
                field.setOccupied(false);
            }else{
                int move;
                if(field.getNumberOf() + diceRoll > 39){
                    //zapętlenie listy
                    move = diceRoll - (39 - field.getNumberOf()) - 1;
                }else {
                    //nie zapętlanie
                    move = diceRoll + field.getNumberOf();
                }
                return move(field, move, diceRoll);
            }
        } else{
            return false;
        }
        return false;
    }

    private boolean move(Field field, int move, int roll){
        if(isOccupied(move) && differentColor(field, move)){
            hit(field, move, roll);
            return true;
        } else if(isOccupied(move)){
            return false;
        } else {
            setPawnOoField(field, move, roll);
            return true;
        }
    }

    private void setPawnOoField(Field field, int move, int roll){
        field.getPawn().setTraveled(roll);
        board.getBoard(move).setPawn((field.getPawn()));
        board.getBoard(move).setOccupied(true);
        field.setPawn(null);
        field.setOccupied(false);
    }

    private boolean differentColor(Field field, int move){
        return board.getBoard(move).getPawn().getColor() != field.getPawn().getColor();
    }

    private boolean differentColor1(int color, int move){
        return board.getBoard(move).getPawn().getColor() != color;
    }

    private boolean isOccupied(int move){
        return board.getBoard(move).isOccupied();
    }

    private void hit(Field field, int move,int roll){
        board.getPlayer(board.getBoard(move).getPawn().getColor())
                .setHome(board.getBoard(move).getPawn());
        board.getBoard(move).setPawn(null);
        field.getPawn().setTraveled(roll);
        board.getBoard(move).setPawn(field.getPawn());
        field.setPawn(null);
        field.setOccupied(false);
    }

    private void hit1(Player player, int move){
        board.getPlayer(board.getBoard(move).getPawn().getColor())
                .setHome(board.getBoard(move).getPawn());
        board.getBoard(move).setPawn(null);
        board.getBoard(move).setPawn(player.getHome(0));
    }

    public boolean offHome(Player player){
        int id = player.getColor();
        switch (id){
            case 0:
                return offHomeMove(player, id, 0);
            case 1:
                return offHomeMove(player, id, 10);
            case 2:
                return offHomeMove(player, id, 20);
            case 3:
                return offHomeMove(player, id, 30);
            default:
                return false;
        }
    }

    private boolean offHomeMove(Player player, int id, int start){
        if(isOccupied(start) && differentColor1(id,start)){
                hit1(player,start);
                return true;
            }else if(isOccupied(start)){
                return false;
            }else {
                board.getBoard(start).setOccupied(true);
                board.getBoard(start).setPawn(player.getHome(0));
                return true;
        }
    }
}