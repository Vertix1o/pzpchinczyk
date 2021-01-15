package Ludo;

import com.sun.jdi.Value;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import model.*;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GameFrameControl {

    @FXML Pane paneBoard; // contains circle and rectangle
    @FXML Button losuj1;
    @FXML Label label1;
    @FXML Label label2;
    @FXML TextField textField;
    @FXML Rectangle p1;
    @FXML Rectangle p2;
    @FXML Rectangle p3;
    @FXML Rectangle p4;
    @FXML Rectangle p5;
    @FXML Rectangle p6;
    @FXML Rectangle p7;
    @FXML Rectangle p8;
    @FXML Rectangle p9;
    @FXML Rectangle p10;
    @FXML Rectangle p11;
    @FXML Rectangle p12;
    @FXML Rectangle p13;
    @FXML Rectangle p14;
    @FXML Rectangle p15;
    @FXML Rectangle p16;
    @FXML Rectangle p17;
    @FXML Rectangle p18;
    @FXML Rectangle p19;
    @FXML Rectangle p20;
    @FXML Rectangle p21;
    @FXML Rectangle p22;
    @FXML Rectangle p23;
    @FXML Rectangle p24;
    @FXML Rectangle p25;
    @FXML Rectangle p26;
    @FXML Rectangle p27;
    @FXML Rectangle p28;
    @FXML Rectangle p29;
    @FXML Rectangle p30;
    @FXML Rectangle p31;
    @FXML Rectangle p32;
    @FXML Rectangle p33;
    @FXML Rectangle p34;
    @FXML Rectangle p35;
    @FXML Rectangle p36;
    @FXML Rectangle p37;
    @FXML Rectangle p38;
    @FXML Rectangle p39;
    @FXML Rectangle p40;
    @FXML Rectangle f1;
    @FXML Rectangle f2;
    @FXML Rectangle f3;
    @FXML Rectangle f4;
    @FXML Rectangle f5;
    @FXML Rectangle f6;
    @FXML Rectangle f7;
    @FXML Rectangle f8;
    @FXML Rectangle f9;
    @FXML Rectangle f10;
    @FXML Rectangle f11;
    @FXML Rectangle f12;
    @FXML Rectangle f13;
    @FXML Rectangle f14;
    @FXML Rectangle f15;
    @FXML Rectangle f16;
    @FXML Circle h1;
    @FXML Circle h2;
    @FXML Circle h3;
    @FXML Circle h4;
    @FXML Circle h5;
    @FXML Circle h6;
    @FXML Circle h7;
    @FXML Circle h8;
    @FXML Circle h9;
    @FXML Circle h10;
    @FXML Circle h11;
    @FXML Circle h12;
    @FXML Circle h13;
    @FXML Circle h14;
    @FXML Circle h15;
    @FXML Circle h16;
    @FXML Group homeGroup;
    @FXML Group rectGroup;
    @FXML MenuItem players2Button;
    @FXML MenuItem players3Button;
    @FXML MenuItem players4Button;

    private Board board;
    private Move move;
    private List<Rectangle> rectangles = new ArrayList<>();
    private ArrayList<ArrayList<Rectangle>> finishes = new ArrayList<>(4);
    private ArrayList<ArrayList<Circle>> homes = new ArrayList<>(4);
    private Player actualPlayer;
    private Checker checker = new Checker();
    private int randomNumber;
    private Field chooseField;
    private Pop pop = new Pop();
    private int tura = 0;

    public GameFrameControl() {

    }

    @FXML
    public void initialize() {
        rectangles.add(p1);
        rectangles.add(p2);
        rectangles.add(p3);
        rectangles.add(p4);
        rectangles.add(p5);
        rectangles.add(p6);
        rectangles.add(p7);
        rectangles.add(p8);
        rectangles.add(p9);
        rectangles.add(p10);
        rectangles.add(p11);
        rectangles.add(p12);
        rectangles.add(p13);
        rectangles.add(p14);
        rectangles.add(p15);
        rectangles.add(p16);
        rectangles.add(p17);
        rectangles.add(p18);
        rectangles.add(p19);
        rectangles.add(p20);
        rectangles.add(p21);
        rectangles.add(p22);
        rectangles.add(p23);
        rectangles.add(p24);
        rectangles.add(p25);
        rectangles.add(p26);
        rectangles.add(p27);
        rectangles.add(p28);
        rectangles.add(p29);
        rectangles.add(p30);
        rectangles.add(p31);
        rectangles.add(p32);
        rectangles.add(p33);
        rectangles.add(p34);
        rectangles.add(p35);
        rectangles.add(p36);
        rectangles.add(p37);
        rectangles.add(p38);
        rectangles.add(p39);
        rectangles.add(p40);
        for(int i = 0; i < 4; i++) {
            homes.add(new ArrayList<>());
            finishes.add(new ArrayList<>());
        }
        homes.get(0).add(h1);
        homes.get(0).add(h2);
        homes.get(0).add(h3);
        homes.get(0).add(h4);
        homes.get(1).add(h5);
        homes.get(1).add(h6);
        homes.get(1).add(h7);
        homes.get(1).add(h8);
        homes.get(2).add(h9);
        homes.get(2).add(h10);
        homes.get(2).add(h11);
        homes.get(2).add(h12);
        homes.get(3).add(h13);
        homes.get(3).add(h14);
        homes.get(3).add(h15);
        homes.get(3).add(h16);
        finishes.get(0).add(f1);
        finishes.get(0).add(f2);
        finishes.get(0).add(f3);
        finishes.get(0).add(f4);
        finishes.get(1).add(f5);
        finishes.get(1).add(f6);
        finishes.get(1).add(f7);
        finishes.get(1).add(f8);
        finishes.get(2).add(f9);
        finishes.get(2).add(f10);
        finishes.get(2).add(f11);
        finishes.get(2).add(f12);
        finishes.get(3).add(f13);
        finishes.get(3).add(f14);
        finishes.get(3).add(f15);
        finishes.get(3).add(f16);
    }

    public void throwDice(ActionEvent event) {
        randomNumber = move.roll();
        String x = String.valueOf(actualPlayer.getColor() + 1);
        label1.setText("Gracz " + x + ". wylosował: " + randomNumber);
//        if(actualPlayer.getHomeList().size() == 4){
//            if(randomNumber == 6){
//                move.offHome(actualPlayer);
//                update();
//            }else {
//                if(actualPlayer.getColor() + 1 >= board.getPlayerList().size()){
//                    actualPlayer = board.getPlayer(0);
//                }else {
//                    actualPlayer = board.getPlayer(actualPlayer.getColor() + 1);
//                }
//            }
//        }
        update();
    }

    public void offHouse(ActionEvent event){
        if(randomNumber == 6){
            move.offHome(actualPlayer);
        }else {
            Pop.messageBox("Zła wartość","Niepoprawna wylosowana wartość");
        }
        update();
    }

    public void abadonMove(ActionEvent event){
        if(actualPlayer.getColor() + 1 >= board.getPlayerList().size()){
            actualPlayer = board.getPlayer(0);
        }else {
            actualPlayer = board.getPlayer(actualPlayer.getColor() + 1);
        }
        update();
    }

    public void choiceOfField(ActionEvent event){
        if(board.getBoard(Integer.parseInt(textField.getText()) - 1).isOccupied()){
            if(actualPlayer.getColor() == board.getBoard(Integer.parseInt(textField.getText()) - 1).getPawnColor()){
                chooseField = board.getBoard(Integer.parseInt(textField.getText()) - 1);
            } else{

            }
        } else{
            Pop.messageBox("Zła wartość","Podane przez ciebie pole jest niewłaściwe");
        }
        update();
    }

    public boolean setMove(ActionEvent event){
        if(chooseField.getPawn().getColor() == actualPlayer.getColor()){
            if(move.moveMain(chooseField,randomNumber)){
                if(randomNumber==6){
                    tura++;
                }
            }else {
                Pop.messageBox("Zła wartość","Podane przez ciebie pole jest niewłaściwe");
                update();
                return false;
            }
        }else {
            Pop.messageBox("Zła wartość","Podane przez ciebie pole jest niewłaściwe");
            update();
            return false;
        }
        if(tura == 3 || randomNumber != 6){
            tura = 0;
            if(actualPlayer.getColor() + 1 >= board.getPlayerList().size()){
                actualPlayer = board.getPlayer(0);
            }else {
                actualPlayer = board.getPlayer(actualPlayer.getColor() + 1);
            }
        }
        update();
        return true;
    }

    public void setGamePlayers(ActionEvent event) {
        MenuItem button = (MenuItem) event.getSource();
        if(button.getId().equals("players2Button")) {
            board = new Board(2);
        } else if(button.getId().equals("players3Button")) {
            board = new Board(3);
        } else if(button.getId().equals("players4Button")) {
            board = new Board(4);
        }
        move = new Move(board);
        actualPlayer = board.getPlayer(0);
        label2.setText("Ruch gracza: " + (actualPlayer.getColor() + 1));
    }

    private void update() {
       for(int i = 0; i<40; i++){
           if(board.getBoard(i).isOccupied()){
               int kolor = board.getBoard(i).getPawnColor();
               switch(kolor){
                   case 0:
                       rectangles.get(i).setFill(Color.RED);
                       break;
                   case 1:
                       rectangles.get(i).setFill(Color.YELLOW);
                       break;
                   case 2:
                       rectangles.get(i).setFill(Color.GREEN);
                       break;
                   case 3:
                       rectangles.get(i).setFill(Color.BLUE);
                       break;
                   default:
                       rectangles.get(i).setFill(Color.WHITE);
                       break;
               }
           } else{
               rectangles.get(i).setFill(Color.WHITE);
           }
       }
       for(int i = 0; i < board.getPlayerList().size() ; i++){
           for(int j = 0; j < board.getPlayer(i).getFinishList().size() ; j++){
               switch(i){
                   case 0:
                       finishes.get(i).get(j).setFill(Color.DARKRED);
                       homes.get(i).get(j).setFill(Color.RED);
                       break;
                   case 1:
                       finishes.get(i).get(j).setFill(Color.ORANGE);
                       homes.get(i).get(j).setFill(Color.YELLOW);
                       break;
                   case 2:
                       finishes.get(i).get(j).setFill(Color.DARKGREEN);
                       homes.get(i).get(j).setFill(Color.GREEN);
                       break;
                   case 3:
                       finishes.get(i).get(j).setFill(Color.DARKBLUE);
                       homes.get(i).get(j).setFill(Color.BLUE);
                       break;
                   default:
                       finishes.get(i).get(j).setFill(Color.WHITE);
                       homes.get(i).get(j).setFill(Color.WHITE);
                       break;
               }
           }
           for(int j = board.getPlayer(i).getFinishList().size(); j > 4 ; j++){
               finishes.get(i).get(j).setFill(Color.WHITE);
               homes.get(i).get(j).setFill(Color.WHITE);
           }
       }
       label2.setText("Ruch gracza: " + (actualPlayer.getColor() + 1));
       checker.checkWin(board.getPlayerList());
       if(checker.getIdWon() != null){
           label2.setText("Wygrał gracz: " + checker.getIdWon().getColor());
       }
    }
}