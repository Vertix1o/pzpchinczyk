package model;

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
    // moveMain zwraca true jeżeli wykonał się ruch false jeżeli nie macie pole do popisu z tym
    //chhyba jest to w miarę dobrze jeszcze raz na to patrzyłem dzisiaj tj. 13.01.2021 i wydaje się być dorze
    public boolean moveMain(Field field, int diceRoll){
        //warunek przjścia pionka na metę
        if(diceRoll > 1){
            if(field.getPawn(0).getTraveled()+diceRoll >= 40){
                board.getPlayer(field.getPawnColor(0)).getFinish().add(field.getPawn(0));
                field.getPawnList().remove(0);
                if(field.getPawnList().size()==0) {
                    field.setOccupied(false);
                }
            }else{
                if(field.getNumberOf() + diceRoll > 39){
                    //zapętlenie listy
                    int move = diceRoll - (39 - field.getNumberOf()) - 1;
                    if(move(field, move, diceRoll)){
                        return true;
                    } else{
                        return false;
                    }

                }else {
                    //nie zapętlanie
                    int move = diceRoll + field.getNumberOf();
                    if(move(field, move, diceRoll)){
                        return true;
                    } else{
                        return false;
                    }
                }
            }
        } else{
            return false;
        }
        return false;
    }

    private boolean move(Field field, int move, int roll){
        if(isOccupied(move)){
            //sprawdzenie czy pole jest zajęte
            if(differentColor(field, move)) {
                //sprawdzenie czy zajęte przez przeciwny kolor
                if(MTO(move)){
                    //więcej niż jeden przeciwny pionek
                    if(moveMain(field, roll-1)){
                        return true;
                    } else{
                        return false;
                    }
                } else{
                    hit(field, move, roll);
                    return true;
                }
            }else {
                //ten sam kolor
                setPawnOoField(field, move, roll);
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
}