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
            if(field.getPawn(0).getTraveled()+diceRoll >= 40){
                board.getPlayer(field.getPawnColor(0)).getFinish().add(field.getPawn(0));
                field.getPawnList().remove(0);
                if(field.getPawnList().size()==0) {
                    field.setOccupied(false);
                }
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
            //sprawdzenie czy pole jest zajęte
            //sprawdzenie czy zajęte przez przeciwny kolor
            if(MTO(move)){
                //więcej niż jeden przeciwny pionek
                return false;
            } else{
                hit(field, move, roll);
                return true;
            }
        }else {
            //nie ma pionka na polu
            setPawnOoField(field, move, roll);
            return true;
        }
    }


    private void setPawnOoField(Field field, int move, int roll){
        field.getPawn(0).setTraveled(roll);
        board.getBoard(move).getPawnList()
                .add(field.getPawn(0));
        board.getBoard(move).setOccupied(true);
        field.getPawnList().remove(0);
        if(field.getPawnList().size()==0) {
            field.setOccupied(false);
        }

    }

    private boolean differentColor(Field field, int move){
        return board.getBoard(move).getPawn(0).getColor() != field.getPawn(0).getColor();
    }

    private boolean differentColor1(int color, int move){
        return board.getBoard(move).getPawn(0).getColor() != color;
    }

    private boolean isOccupied(int move){
        return board.getBoard(move).isOccupied();
    }

    private boolean MTO(int move){
        return board.getBoard(move).getPawnList().size() > 1;
    }

    private void hit(Field field, int move,int roll){
        board.getPlayer(board.getBoard(move).getPawn(0).getColor())
                .setHome(board.getBoard(move).getPawn(0));
        board.getBoard(move).getPawnList().remove(0);
        field.getPawn(0).setTraveled(roll);
        board.getBoard(move).getPawnList().add(field.getPawn(0));
        field.getPawnList().remove(0);
        if(field.getPawnList().size()==0) {
            field.setOccupied(false);
        }
    }

    private void hit1(Player player, int move){
        board.getPlayer(board.getBoard(move).getPawn(0).getColor())
                .setHome(board.getBoard(move).getPawn(0));
        board.getBoard(move).getPawnList().remove(0);
        board.getBoard(move).getPawnList().add(player.getHome(0));
    }

    private boolean offHome(Player player){
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
            if(MTO(start)){
                return false;
            } else{
                hit1(player,0);
                return true;
            }
        } else{
            board.getBoard(start).setOccupied(true);
            board.getBoard(start).getPawnList().add(player.getHome(0));
            return true;
        }
    }
}